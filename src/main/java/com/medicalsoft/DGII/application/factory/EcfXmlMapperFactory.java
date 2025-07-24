package com.medicalsoft.DGII.application.factory;


import com.medicalsoft.DGII.domain.interfaces.ExcelToEcfMapper;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper47;

public class EcfXmlMapperFactory {

    public static ExcelToEcfMapper<?> getMapper(String tipoEcf) {
        return switch (tipoEcf) {
            case "47" -> new EcfXmlMapper47();
            // case "43" -> new EcfXmlMapper43(); // Ejemplo futuro
            default -> throw new IllegalArgumentException("Tipo de eCF no soportado: " + tipoEcf);
        };
    }
}
