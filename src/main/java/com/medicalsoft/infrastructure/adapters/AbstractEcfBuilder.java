package com.medicalsoft.infrastructure.adapters;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.medicalsoft.DGII.application.ports.out.EcfBuilder;
import com.medicalsoft.DGII.model.FieldHandler;
import com.medicalsoft.DGII.shared.utils.ExcelUtils;

public abstract class AbstractEcfBuilder<T> implements EcfBuilder<T> {
    protected final Map<String, FieldHandler<T>> fieldHandlers = new HashMap<>();
    protected final Sheet sheet;
    protected final Map<Integer, Object> itemMap = new TreeMap<>();

    public AbstractEcfBuilder(Sheet sheet) {
        this.sheet = Objects.requireNonNull(sheet, "Sheet no puede ser nulo");
    }

    protected final void initializeHandlers() {
        registerFieldHandlers();
    }

    protected abstract void registerFieldHandlers();

    @Override
    public void addFieldHandler(String handlerName, FieldHandler<T> handler) {
        fieldHandlers.put(handlerName, handler);
    }

    @Override
    public T build() throws Exception {
        Row headerRow = sheet.getRow(0);
        Row dataRow = sheet.getRow(1);

        for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {
            String columnName = headerRow.getCell(i).getStringCellValue().trim();
            String cellValue = ExcelUtils.getCellString(dataRow.getCell(i));

            if (shouldSkip(cellValue)) continue;

            processField(columnName, cellValue);
        }

        return postProcess();
    }

    protected boolean shouldSkip(String cellValue) {
        return cellValue.equalsIgnoreCase("#e") || cellValue.isEmpty();
    }

    @Override
    public void processField(String columnName, String cellValue) throws Exception {
        for (FieldHandler<T> handler : fieldHandlers.values()) {
            if (handler.canHandle(columnName)) {
                handler.handle(columnName, cellValue, getContext());
                return;
            }
        }
        handleUnmappedField(columnName);
    }

    protected abstract T getContext();
    protected abstract T postProcess() throws Exception;
    protected abstract void handleUnmappedField(String columnName);
}