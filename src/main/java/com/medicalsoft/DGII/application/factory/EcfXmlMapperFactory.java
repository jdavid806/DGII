package com.medicalsoft.DGII.application.factory;


import com.medicalsoft.DGII.domain.interfaces.ExcelToEcfMapper;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper32;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper47;

public class EcfXmlMapperFactory {

    public static ExcelToEcfMapper<?> getMapper(String tipoEcf) {
        return switch (tipoEcf) {
            case "32" -> new EcfXmlMapper32();
            case "47" -> new EcfXmlMapper47();             // Ejemplo futuro
            default -> throw new IllegalArgumentException("Tipo de eCF no soportado: " + tipoEcf);
        };
    }
}
