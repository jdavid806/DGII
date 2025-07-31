package com.medicalsoft.infrastructure.base;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import com.medicalsoft.DGII.model.FieldHandler;
import com.medicalsoft.DGII.shared.utils.ExcelUtils;

/**
 * Clase base abstracta para manejar detalles de ítems en diferentes versiones
 * de ECF
 * 
 * @param <T> Tipo del objeto ECF (ECF, ECF32, etc.)
 * @param <U> Tipo de la tabla de detalles de ítems (DetallesItems, etc.)
 * @param <F> Tipo del ítem individual (DetallesItems.Item, etc.)
 */
public abstract class BaseDetallesItemHandler<T, U, F> implements FieldHandler<T> {
    protected U tablaDetallesItem;

    /**
     * Crea una nueva instancia de la tabla de detalles de ítems.
     */
    protected abstract U createNewTablaDetallesItem();

    /**
     * Crea una nueva instancia de un ítem.
     */
    protected abstract F createNewItem();

    /**
     * Obtiene la lista de ítems dentro de la tabla.
     */
    protected abstract List<F> getItems();

    /**
     * Establece un ítem en un índice específico.
     */
    protected abstract void setItem(int index, F item);

    @Override
    public void handle(String columnName, String cellValue, T context) throws Exception {
        int idx = ExcelUtils.extractIndex(columnName); // idx es 1-based

        if (cellValue == null || cellValue.trim().isEmpty() || "#e".equalsIgnoreCase(cellValue.trim())) {
            return;
        }

        ensureSize(getItems(), idx);

        F item = Optional.ofNullable(getItems().get(idx - 1))
                .orElseGet(() -> {
                    F newItem = createNewItem();
                    setItem(idx - 1, newItem);
                    return newItem;
                });

        String cleanedColumnName = columnName.trim().replaceAll("\\[\\s*\\d+\\s*]", ""); // elimina [1]
        String baseField = Character.toUpperCase(cleanedColumnName.charAt(0)) + cleanedColumnName.substring(1);

        // Manejar campo especial NumeroLinea
        if ("NumeroLinea".equalsIgnoreCase(baseField)) {
            try {
                int numeroLinea = Integer.parseInt(cellValue.trim());
                Method setter = ExcelUtils.findSetter(item.getClass(), "NumeroLinea");
                if (setter != null) {
                    setter.invoke(item, Math.max(1, numeroLinea));
                }
            } catch (NumberFormatException e) {
                System.out.println("Error parseando NumeroLinea: " + e.getMessage());
            }
            return;
        }

        // Manejar subestructura Retencion
        if (baseField.equalsIgnoreCase("IndicadorAgenteRetencionoPercepcion")
                || baseField.equalsIgnoreCase("MontoITBISRetenido")
                || baseField.equalsIgnoreCase("MontoISRRetenido")) {

            Object retencionObj = ExcelUtils.getOrCreateSubstructure(item, "retencion");

            Method setterRetencion = ExcelUtils.findSetter(retencionObj.getClass(), baseField);
            if (setterRetencion != null) {
                Object parsed = ExcelUtils.parseValue(cellValue, setterRetencion.getParameterTypes()[0]);
                setterRetencion.invoke(retencionObj, parsed);
            }

            return;
        }

        // Campos normales
        Method setter = ExcelUtils.findSetter(item.getClass(), baseField);
        if (setter != null) {
            Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
            setter.invoke(item, parsed);
        }
    }

    private void ensureSize(List<?> list, int size) {
        while (list.size() < size) {
            list.add(null);
        }
    }

}
