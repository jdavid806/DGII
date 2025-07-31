package com.medicalsoft.infrastructure.dgii.hanlder.ecf31;

import java.util.Objects;

import com.medicalsoft.DGII.model.FieldHandler;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Encabezado.Emisor;

/**
 * Handler específico para teléfonos del emisor
 */
public class TelefonoEmisorHandler31 implements FieldHandler<ECF> {
    private final Emisor emisor;

    public TelefonoEmisorHandler31(Emisor emisor) {
        this.emisor = Objects.requireNonNull(emisor);
    }

    @Override
    public boolean canHandle(String columnName) {
        return columnName.matches("TelefonoEmisor\\[\\d+\\]");
    }

    @Override
    public void handle(String columnName, String cellValue, ECF context) {
        String telefono = cellValue.trim();
        if (!telefono.isEmpty()) {
            synchronized (emisor) {
                if (emisor.getTablaTelefonoEmisor() == null) {
                    emisor.setTablaTelefonoEmisor(new Emisor.TablaTelefonoEmisor());
                }
                emisor.getTablaTelefonoEmisor().getTelefonoEmisor().add(telefono);
            }
        }
    }
}
