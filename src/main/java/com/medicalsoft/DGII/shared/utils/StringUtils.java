package com.medicalsoft.DGII.shared.utils;

public class StringUtils {

    private StringUtils() {}

    public static boolean isNullOrBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String capitalize(String str) {
        if (isNullOrBlank(str)) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static boolean containsOnlyLetters(String str) {
        return str != null && str.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");
    }

    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static String removeAccents(String input) {
        return java.text.Normalizer
                .normalize(input, java.text.Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }
}