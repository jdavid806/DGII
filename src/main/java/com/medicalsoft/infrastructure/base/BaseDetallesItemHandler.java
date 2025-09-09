package com.medicalsoft.infrastructure.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.medicalsoft.DGII.model.FieldHandler;
import com.medicalsoft.DGII.shared.utils.ExcelUtils;

/**
 * Clase base abstracta para manejar detalles de ítems en diferentes versiones de ECF
 *
 * @param <T> Tipo del objeto ECF (ECF, ECF32, etc.)
 * @param <U> Tipo de la tabla de detalles de ítems (DetallesItems, etc.)
 * @param <F> Tipo del ítem individual (DetallesItems.Item, etc.)
 */
public abstract class BaseDetallesItemHandler<T, U, F> implements FieldHandler<T> {
    protected U tablaDetallesItem;

    protected abstract U createNewTablaDetallesItem();
    protected abstract F createNewItem();
    protected abstract List<F> getItems();
    protected abstract void setItem(int index, F item);

    @Override
    public void handle(String columnName, String cellValue, T context) throws Exception {
        int idx = ExcelUtils.extractIndex(columnName); // índice del ítem (1-based)

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

        // Nombre base sin índices: "DescuentoMonto[4]" -> "DescuentoMonto"
        String cleanedColumnName = columnName.trim().replaceAll("\\[\\s*\\d+\\s*]", "");
        String baseField = capitalizeFirst(cleanedColumnName);

        // NumeroLinea especial
        if ("NumeroLinea".equalsIgnoreCase(baseField)) {
            try {
                int numeroLinea = Integer.parseInt(cellValue.trim());
                Method setter = ExcelUtils.findSetter(item.getClass(), "NumeroLinea");
                if (setter != null) setter.invoke(item, Math.max(1, numeroLinea));
            } catch (NumberFormatException ignore) {}
            return;
        }

        // Subestructura Retencion
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

        // ==============================
        //  TABLA SUB DESCUENTO [i][j]
        // ==============================
        if (baseField.equalsIgnoreCase("TipoSubDescuento")
                || baseField.equalsIgnoreCase("SubDescuentoPorcentaje")
                || baseField.equalsIgnoreCase("MontoSubDescuento")) {

            // Buscar patrón doble índice: [item][sub]
            Matcher m = Pattern.compile("\\[(\\d+)]\\[(\\d+)]").matcher(columnName);
            if (m.find()) {
                int subIdx = Integer.parseInt(m.group(2)); // índice del SubDescuento (1-based)

                // 1) Obtener/crear la tabla: campo es "tablaSubDescuento" (lowerCamel como en JAXB)
                Object tablaSubDescuento = ExcelUtils.getOrCreateSubstructure(item, "tablaSubDescuento");

                // 2) Obtener la lista List<SubDescuento> vía getter "getSubDescuento"
                List<?> lista = invokeListGetter(tablaSubDescuento, "SubDescuento"); // retorna lista viva de JAXB

                // 3) Asegurar que la lista tenga al menos 'subIdx' elementos y obtener el j-ésimo
                Object subDescuento = ensureListElement(tablaSubDescuento, lista, "SubDescuento", subIdx);

                // 4) Setear el campo dentro de SubDescuento
                Method setter = ExcelUtils.findSetter(subDescuento.getClass(), baseField);
                if (setter != null) {
                    Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                    setter.invoke(subDescuento, parsed);
                }
            }
            return;
        }

        // Campos normales del Item
        Method setter = ExcelUtils.findSetter(item.getClass(), baseField);
        if (setter != null) {
            Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
            setter.invoke(item, parsed);
        }
    }

    // --------------------------
    // Helpers privados
    // --------------------------

    private void ensureSize(List<?> list, int size) {
        while (list.size() < size) {
            list.add(null);
        }
    }

    private static String capitalizeFirst(String s) {
        if (s == null || s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    /**
     * Invoca el getter "get{listName}" y retorna la lista (sin genéricos en compilación).
     * Ej: listName="SubDescuento" -> llama getSubDescuento()
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static List<?> invokeListGetter(Object owner, String listName) throws Exception {
        String getter = "get" + listName;
        Method m = findNoArgMethod(owner.getClass(), getter);
        if (m == null) {
            // Intento alterno por si pasan "subDescuento"
            m = findNoArgMethod(owner.getClass(), "get" + capitalizeFirst(listName));
        }
        if (m == null) {
            throw new NoSuchMethodException("No se encontró método " + getter + " en " + owner.getClass());
        }
        Object res = m.invoke(owner);
        if (!(res instanceof List)) {
            throw new IllegalStateException(getter + " no retornó List en " + owner.getClass());
        }
        return (List) res;
    }

    private static Method findNoArgMethod(Class<?> type, String name) {
        for (Method m : type.getMethods()) {
            if (m.getName().equals(name) && m.getParameterCount() == 0) return m;
        }
        return null;
    }

    /**
     * Asegura que la lista tenga un elemento en la posición 'index' (1-based).
     * Si falta, crea una instancia de la clase interna con simpleName==childSimpleName y la inserta.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static Object ensureListElement(Object tableObj, List<?> list, String childSimpleName, int index) throws Exception {
        List raw = (List) list;
        while (raw.size() < index) raw.add(null);
        Object current = raw.get(index - 1);
        if (current == null) {
            Object created = newNestedChildBySimpleName(tableObj, childSimpleName);
            raw.set(index - 1, created);
            return created;
        }
        return current;
    }

    /**
     * Busca entre las clases anidadas declaradas de 'tableObj' una cuyo simpleName coincida
     * y la instancia con constructor sin argumentos (JAXB genera anidadas estáticas).
     */
    private static Object newNestedChildBySimpleName(Object tableObj, String childSimpleName) throws Exception {
        Class<?> ownerClass = tableObj.getClass();
        for (Class<?> nested : ownerClass.getDeclaredClasses()) {
            if (nested.getSimpleName().equals(childSimpleName)) {
                Constructor<?> ctor = nested.getDeclaredConstructor();
                ctor.setAccessible(true);
                return ctor.newInstance();
            }
        }
        throw new ClassNotFoundException("No se encontró clase anidada '" + childSimpleName + "' en " + ownerClass);
    }
}
