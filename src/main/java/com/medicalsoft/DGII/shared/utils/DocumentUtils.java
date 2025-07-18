package com.medicalsoft.DGII.shared.utils;

public class DocumentUtils {

    public static String generateInvoiceCode(String prefix, int number) {
        return prefix + String.format("%08d", number);
    }

    public static boolean isValidNIT(String nit) {
        return nit != null && nit.matches("\\d{5,15}");
    }
}
