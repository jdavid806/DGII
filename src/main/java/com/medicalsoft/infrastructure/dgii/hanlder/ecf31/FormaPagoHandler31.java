package com.medicalsoft.infrastructure.dgii.hanlder.ecf31;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.medicalsoft.infrastructure.base.BaseFormaPagoHandler;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF;

public class FormaPagoHandler31 extends BaseFormaPagoHandler<
    ECF, 
    ECF.Encabezado.IdDoc.TablaFormasPago,
    ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago> {

    private final ECF.Encabezado.IdDoc idDoc;
    
    public FormaPagoHandler31(ECF.Encabezado.IdDoc idDoc) {
        this.idDoc = Objects.requireNonNull(idDoc, "IdDoc no puede ser nulo");
        // Movemos la inicialización aquí en lugar de usar initialize()
        this.tablaFormasPago = Optional.ofNullable(idDoc.getTablaFormasPago())
            .orElseGet(this::createNewTablaFormasPago);
        idDoc.setTablaFormasPago(this.tablaFormasPago);
    }
    
    @Override
    protected ECF.Encabezado.IdDoc.TablaFormasPago createNewTablaFormasPago() {
        return new ECF.Encabezado.IdDoc.TablaFormasPago();
    }
    
    @Override
    protected ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago createNewFormaDePago() {
        return new ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago();
    }
    
    @Override
    protected List<ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago> getFormasDePago() {
        return tablaFormasPago.getFormaDePago();
    }
    
    @Override
    protected void setFormaDePago(int index, ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago formaDePago) {
        tablaFormasPago.getFormaDePago().set(index, formaDePago);
    }
    
    @Override
    public boolean canHandle(String columnName) {
        return columnName.matches("(FormaPago|MontoPago)\\[\\d+\\]");
    }
}