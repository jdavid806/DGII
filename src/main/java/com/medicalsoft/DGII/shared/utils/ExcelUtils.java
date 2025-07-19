package com.medicalsoft.DGII.shared.utils;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.medicalsoft.DGII.shared.utils.ConvertUtils;

import org.apache.poi.ss.usermodel.Cell;

public class ExcelUtils {

    public static Method findSetter(Class<?> clazz, String fieldName) {
        String methodName = "set" + fieldName;

        Class<?>[] commonTypes = {
                String.class,
                BigDecimal.class,
                Integer.class, int.class,
                BigInteger.class,
                Boolean.class, boolean.class
        };

        for (Class<?> type : commonTypes) {
            try {
                return clazz.getMethod(methodName, type);
            } catch (NoSuchMethodException ignored) {
            }
        }

        return null;
    }

    public static Object parseValue(String value, Class<?> type) {
        if (value == null || value.trim().isEmpty())
            return null;

        String trimmed = value.trim();
        try {
            if (type == String.class) {
                return trimmed;
            } else if (type == BigDecimal.class) {
                return ConvertUtils.toBigDecimal(trimmed);
            } else if (type == BigInteger.class) {
                return ConvertUtils.toBigInteger(trimmed);
            } else if (type == Integer.class || type == int.class) {
                return ConvertUtils.toInteger(trimmed);
            } else if (type == Long.class || type == long.class) {
                return Long.parseLong(trimmed); // Podrías hacer un ConvertUtils.toLong() si deseas
            } else if (type == Double.class || type == double.class) {
                return ConvertUtils.toDouble(trimmed);
            } else if (type == Boolean.class || type == boolean.class) {
                return ConvertUtils.toBoolean(trimmed);
            }
        } catch (Exception e) {
            System.err.println(
                    "Error al convertir valor [" + value + "] a tipo " + type.getSimpleName() + ": " + e.getMessage());
        }
        return null;
    }

    public static String getCellString(Cell cell) {
        if (cell == null)
            return "";
        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue().trim();
            case NUMERIC -> String.valueOf(cell.getNumericCellValue());
            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
            default -> "";
        };
    }
}
