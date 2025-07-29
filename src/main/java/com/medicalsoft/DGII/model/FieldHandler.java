package com.medicalsoft.DGII.model;


public interface FieldHandler<T> {
    boolean canHandle(String columnName);
    void handle(String columnName, String cellValue, T context) throws Exception;
}