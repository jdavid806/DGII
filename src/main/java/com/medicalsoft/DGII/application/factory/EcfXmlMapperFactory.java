package com.medicalsoft.DGII.application.factory;


import com.medicalsoft.DGII.application.ports.input.ExcelToEcfMapper;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper31;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper32;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper33;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper34;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper41;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper43;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper44;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper45;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper46;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper47;

public class EcfXmlMapperFactory {

    public static ExcelToEcfMapper<?> getMapper(String tipoEcf) {
        return switch (tipoEcf) {
            case "31" -> new EcfXmlMapper31();            
            case "32" -> new EcfXmlMapper32();
            case "33" -> new EcfXmlMapper33();
            case "34" -> new EcfXmlMapper34();  
            case "41" -> new EcfXmlMapper41();
            case "43" -> new EcfXmlMapper43();  
            case "44" -> new EcfXmlMapper44();
            case "45" -> new EcfXmlMapper45();  
            case "46" -> new EcfXmlMapper46();  
            case "47" -> new EcfXmlMapper47();  
            default -> throw new IllegalArgumentException("Tipo de eCF no soportado: " + tipoEcf);
        };
    }
}
