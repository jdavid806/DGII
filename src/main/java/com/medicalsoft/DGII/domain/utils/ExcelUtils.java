package com.medicalsoft.DGII.domain.utils;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;

public class ExcelUtils {

    public static String getCellString(org.apache.poi.ss.usermodel.Cell cell) {
        if (cell == null) return "";
        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue().trim();
            case NUMERIC -> String.valueOf(cell.getNumericCellValue());
            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
            default -> "";
        };
    }

    public static Method findSetter(Class<?> clazz, String fieldName) {
        String methodName = "set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
        for (Method method : clazz.getMethods()) {
            if (method.getName().equals(methodName) && method.getParameterCount() == 1) {
                return method;
            }
        }
        return null;
    }

    public static Object parseValue(String value, Class<?> targetType) {
        if (targetType == String.class) return value;
        if (targetType == Integer.class || targetType == int.class) return Integer.parseInt(value);
        if (targetType == BigDecimal.class) return new BigDecimal(value);
        if (targetType == Boolean.class || targetType == boolean.class) return Boolean.parseBoolean(value);
        if (targetType == Double.class || targetType == double.class) return Double.parseDouble(value);
        // Agrega más según tus necesidades
        return null;
    }

    public static int extractIndex(String text) {
        var matcher = java.util.regex.Pattern.compile("\\[(\\d+)]").matcher(text);
        return matcher.find() ? Integer.parseInt(matcher.group(1)) : -1;
    }

    public static <T> void ensureSize(List<T> list, int size) {
        while (list.size() < size) {
            list.add(null);
        }
    }
}
