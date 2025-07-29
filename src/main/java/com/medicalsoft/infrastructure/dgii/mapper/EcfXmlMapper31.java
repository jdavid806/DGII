package com.medicalsoft.infrastructure.dgii.mapper;

import org.apache.poi.ss.usermodel.Sheet;

import com.medicalsoft.DGII.application.ports.input.ExcelToEcfMapper;
import com.medicalsoft.infrastructure.builder.Ecf31Builder;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF;

// infrastructure/adapters/mappers
public class EcfXmlMapper31 implements ExcelToEcfMapper<ECF> {
    @Override
    public ECF map(Sheet sheet) throws Exception {
        return new Ecf31Builder(sheet).build();
    }
}