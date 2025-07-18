package com.medicalsoft.DGII.shared.utils;

import java.util.regex.Pattern;

public class ValidationUtils {

    private static final Pattern EMAIL_REGEX = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    private static final Pattern NIT_REGEX = Pattern.compile("^\\d{5,15}$");
    private static final Pattern PHONE_REGEX = Pattern.compile("^\\+?\\d{7,15}$");

    public static boolean isValidEmail(String email) {
        return email != null && EMAIL_REGEX.matcher(email).matches();
    }

    public static boolean isValidNIT(String nit) {
        return nit != null && NIT_REGEX.matcher(nit).matches();
    }

    public static boolean isValidPhone(String phone) {
        return phone != null && PHONE_REGEX.matcher(phone).matches();
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isPositiveNumber(Number number) {
        return number != null && number.doubleValue() > 0;
    }
}
