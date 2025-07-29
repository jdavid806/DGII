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
        ensureSize(getItems(), idx);

        F item = Optional.ofNullable(getItems().get(idx - 1))
                .orElseGet(() -> {
                    F newItem = createNewItem();
                    setItem(idx - 1, newItem);
                    return newItem;
                });

        String cleanedColumnName = columnName.trim().replaceAll("\\[\\s*\\d+\\s*]", ""); // elimina [1] o [ 1 ]
        String baseField = Character.toUpperCase(cleanedColumnName.charAt(0)) + cleanedColumnName.substring(1);

        System.out.println("DEBUG -> columnName: [" + columnName + "], cleanedColumnName: [" + cleanedColumnName
                + "], baseField: [" + baseField + "]");

        if ("NumeroLinea".equalsIgnoreCase(baseField)) {
            try {
                int numeroLinea = Integer.parseInt(cellValue.trim());
                Method setter = ExcelUtils.findSetter(item.getClass(), "NumeroLinea");
                if (setter != null) {
                    setter.invoke(item, Math.max(1, numeroLinea));
                    System.out.println("DEBUG -> NumeroLinea seteado: " + Math.max(1, numeroLinea));
                } else {
                    System.out.println("DEBUG -> Setter no encontrado para NumeroLinea");
                }
            } catch (NumberFormatException e) {
                System.out.println("DEBUG -> Error al parsear NumeroLinea: " + cellValue);
            }
            return;
        }

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
