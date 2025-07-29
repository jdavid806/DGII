package com.medicalsoft.DGII.config;

import org.springframework.context.annotation.Bean;

import com.medicalsoft.DGII.application.ports.input.ExcelToEcfMapper;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF;
import com.medicalsoft.infrastructure.dgii.mapper.EcfXmlMapper31;

// config
public class MapperConfiguration {
    @Bean
    public ExcelToEcfMapper<ECF> ecf31Mapper() {
        return new EcfXmlMapper31();
    }

}