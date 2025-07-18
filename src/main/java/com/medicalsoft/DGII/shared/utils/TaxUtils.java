package com.medicalsoft.DGII.shared.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxUtils {

    public static BigDecimal calculateIVA(BigDecimal amount, BigDecimal ivaPercentage) {
        return amount.multiply(ivaPercentage).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal applyRetention(BigDecimal amount, BigDecimal retentionPercentage) {
        return amount.multiply(retentionPercentage).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }
}
