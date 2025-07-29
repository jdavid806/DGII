package com.medicalsoft.infrastructure.base;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import com.medicalsoft.DGII.model.FieldHandler;
import com.medicalsoft.DGII.shared.utils.ExcelUtils;

/**
 * Clase base abstracta para manejar formas de pago en diferentes versiones de ECF
 * @param <T> Tipo del objeto ECF (ECF, ECF32, etc.)
 * @param <U> Tipo de la tabla de formas de pago específica de cada versión
 */
public abstract class BaseFormaPagoHandler<T, U, F> implements FieldHandler<T> {
    protected U tablaFormasPago;
    
    /**
     * Crea una nueva instancia de la tabla de formas de pago
     */
    protected abstract U createNewTablaFormasPago();
    
    /**
     * Crea una nueva instancia de FormaDePago
     */
    protected abstract F createNewFormaDePago();
    
    /**
     * Obtiene la lista de formas de pago
     */
    protected abstract List<F> getFormasDePago();
    
    /**
     * Establece una forma de pago en un índice específico
     */
    protected abstract void setFormaDePago(int index, F formaDePago);
    
    @Override
    public void handle(String columnName, String cellValue, T context) throws Exception {
        int idx = ExcelUtils.extractIndex(columnName);
        ensureSize(getFormasDePago(), idx);
        
        F forma = Optional.ofNullable(getFormasDePago().get(idx - 1))
            .orElseGet(() -> {
                F newForma = createNewFormaDePago();
                setFormaDePago(idx - 1, newForma);
                return newForma;
            });
        
        String baseField = columnName.replaceAll("\\[\\d+]", "");
        Method setter = ExcelUtils.findSetter(forma.getClass(), baseField);
        if (setter != null) {
            Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
            setter.invoke(forma, parsed);
        }
    }
    
    private void ensureSize(List<?> list, int size) {
        while (list.size() < size) {
            list.add(null);
        }
    }
}