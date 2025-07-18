package com.medicalsoft.DGII.shared.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyUtils {

    public static BigDecimal round(BigDecimal amount, int decimals) {
        return amount.setScale(decimals, RoundingMode.HALF_UP);
    }

    public static String formatCurrency(BigDecimal amount) {
        return NumberFormat.getCurrencyInstance(new Locale("es", "CO")).format(amount);
    }

    public static boolean isZero(BigDecimal amount) {
        return amount.compareTo(BigDecimal.ZERO) == 0;
    }
}
