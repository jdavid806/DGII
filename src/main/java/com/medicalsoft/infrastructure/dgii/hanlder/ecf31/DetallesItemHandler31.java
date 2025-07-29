package com.medicalsoft.infrastructure.dgii.hanlder.ecf31;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.medicalsoft.infrastructure.base.BaseDetallesItemHandler;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF;

public class DetallesItemHandler31 extends BaseDetallesItemHandler<ECF, ECF.DetallesItems, ECF.DetallesItems.Item> {

    public DetallesItemHandler31(ECF ecf) {
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
    boolean result = columnName.matches("[a-zA-Z_]+\\[\\d+\\]");
    System.out.println("canHandle? " + columnName + " -> " + result);
    return result;
}

}
