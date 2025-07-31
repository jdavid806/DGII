package com.medicalsoft.infrastructure.dgii.hanlder.ecf41;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.medicalsoft.infrastructure.base.BaseDetallesItemHandler;
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF;

public class DetallesItemHandler41 extends BaseDetallesItemHandler<ECF, ECF.DetallesItems, ECF.DetallesItems.Item> {

    public DetallesItemHandler41(ECF ecf) {
        Objects.requireNonNull(ecf, "ECF no puede ser nulo");
        this.tablaDetallesItem = Optional.ofNullable(ecf.getDetallesItems())
                .orElseGet(this::createNewTablaDetallesItem);
        ecf.setDetallesItems(this.tablaDetallesItem);
    }

    @Override
    protected ECF.DetallesItems createNewTablaDetallesItem() {
        return new ECF.DetallesItems();
    }

    @Override
    protected ECF.DetallesItems.Item createNewItem() {
        return new ECF.DetallesItems.Item();
    }

    @Override
    protected List<ECF.DetallesItems.Item> getItems() {
        return tablaDetallesItem.getItem();
    }

    @Override
    protected void setItem(int index, ECF.DetallesItems.Item item) {
        getItems().set(index, item);
    }

    @Override
public boolean canHandle(String columnName) {
    return columnName.matches("[a-zA-Z_]+\\[\\d+\\]") ||
           columnName.matches("Item\\[\\d+\\]\\..+") ||
           columnName.matches("[a-zA-Z]+Item\\[\\d+]") ||
           columnName.matches("CodigoItem(\\[\\d+]){2}") ||
           columnName.matches("TipoSubDescuento\\[\\d+\\]\\[\\d+]") ||
           columnName.matches("MontoSubDescuento\\[\\d+\\]\\[\\d+]") ||
           columnName.matches("SubDescuentoPorcentaje\\[\\d+\\]\\[\\d+]") ||
           columnName.matches("(IndicadorAgenteRetencionoPercepcion|MontoITBISRetenido|MontoISRRetenido)\\[\\d+\\]");
}


 
}
