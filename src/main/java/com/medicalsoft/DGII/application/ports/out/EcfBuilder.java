package com.medicalsoft.DGII.application.ports.out;

import com.medicalsoft.DGII.model.FieldHandler;

public interface EcfBuilder<T> {
    T build() throws Exception;
    void addFieldHandler(String handlerName, FieldHandler<T> handler);
    void processField(String columnName, String cellValue) throws Exception;
}
