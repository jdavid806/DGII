package com.medicalsoft.DGII.shared.utils;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

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

    public static int extractIndex(String input) {
        Matcher m = Pattern.compile("\\[(\\d+)]").matcher(input);
        return m.find() ? Integer.parseInt(m.group(1)) : 1;
    }

    public static int extractSubIndex(String fieldName) {
        try {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\[(\\d+)]").matcher(fieldName);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
        } catch (Exception e) {
            System.err.println("Error extrayendo subíndice de: " + fieldName);
        }
        return 0;
    }

    public static <T> void ensureSize(List<T> list, int size) {
        while (list.size() < size) {
            list.add(null);
        }
    }

    public static boolean filaVacia(Row row) {
        if (row == null)
            return true;
        for (Cell cell : row) {
            if (cell.getCellType() != CellType.BLANK &&
                    cell.getCellType() != CellType._NONE) {
                return false;
            }
        }
        return true;
    }

}
