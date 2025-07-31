package com.medicalsoft.infrastructure.dgii.hanlder.ecf41;


import java.util.List;
import java.util.Objects;


import com.medicalsoft.infrastructure.base.BaseFormaPagoHandler;
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF;

public class FormaPagoHandler41 extends BaseFormaPagoHandler<
    ECF, 
    ECF.Encabezado.IdDoc.TablaFormasPago,
    ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago> {

    private final ECF.Encabezado.IdDoc idDoc;
    private final ECF.Encabezado.IdDoc.TablaFormasPago tablaFormasPagoTemp;

    public FormaPagoHandler41(ECF.Encabezado.IdDoc idDoc) {
        this.idDoc = Objects.requireNonNull(idDoc, "IdDoc no puede ser nulo");
        this.tablaFormasPagoTemp = createNewTablaFormasPago();
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
        return tablaFormasPagoTemp.getFormaDePago();
    }

    @Override
    protected void setFormaDePago(int index, ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago formaDePago) {
        tablaFormasPagoTemp.getFormaDePago().set(index, formaDePago);
    }

    @Override
    public boolean canHandle(String columnName) {
        return columnName.matches("(FormaPago|MontoPago)\\[\\d+\\]");
    }

    public void applyIfNotEmpty() {
        if (!tablaFormasPagoTemp.getFormaDePago().isEmpty()) {
            idDoc.setTablaFormasPago(tablaFormasPagoTemp);
        }
    }
}
