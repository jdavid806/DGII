package com.medicalsoft.DGII.shared.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ConvertUtils {

    public static BigDecimal toBigDecimal(String value) {
        try {
            return new BigDecimal(value.trim());
        } catch (Exception e) {
            return null;
        }
    }

    public static BigDecimal toBigDecimal(Object value) {
        try {
            if (value instanceof BigDecimal)
                return (BigDecimal) value;
            if (value instanceof Number)
                return new BigDecimal(((Number) value).toString());
            if (value instanceof String)
                return new BigDecimal(((String) value).trim());
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static BigInteger toBigInteger(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        try {
            // Elimina decimales si vienen como "30.0" → "30"
            String cleaned = value.trim().split("\\.")[0];
            return new BigInteger(cleaned);
        } catch (Exception e) {
            System.err.println("error al convertir" + e);
            return null;
        }
    }

    public static Integer toInteger(String value) {
        try {
            return Integer.valueOf(value.trim());
        } catch (Exception e) {
            return null;
        }
    }

    public static Boolean toBoolean(String value) {
        try {
            return Boolean.parseBoolean(value.trim());
        } catch (Exception e) {
            return null;
        }
    }

    public static Double toDouble(String value) {
        try {
            return Double.valueOf(value.trim());
        } catch (Exception e) {
            return null;
        }
    }
}
