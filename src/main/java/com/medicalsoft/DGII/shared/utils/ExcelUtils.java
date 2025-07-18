package com.medicalsoft.DGII.shared.utils;

import java.lang.reflect.Method;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;

public class ExcelUtils {

    public static Method findSetter(Class<?> clazz, String fieldName) {
        try {
            return clazz.getMethod("set" + fieldName, String.class);
        } catch (NoSuchMethodException e) {
            try {
                return clazz.getMethod("set" + fieldName, BigDecimal.class);
            } catch (NoSuchMethodException ex) {
                return null;
            }
        }
    }

    public static Object parseValue(String value, Class<?> type) {
        if (type == String.class) {
            return value;
        } else if (type == BigDecimal.class) {
            return new BigDecimal(value);
        } else if (type == Integer.class || type == int.class) {
            return Integer.parseInt(value);
        }
        return null;
    }

    public static String getCellString(Cell cell) {
        if (cell == null) return "";
        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue().trim();
            case NUMERIC -> String.valueOf(cell.getNumericCellValue());
            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
            default -> "";
        };
    }
}
