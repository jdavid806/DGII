package com.medicalsoft.infrastructure.dgii.mapper;

import org.apache.poi.ss.usermodel.Sheet;

import com.medicalsoft.DGII.application.ports.input.ExcelToEcfMapper;
import com.medicalsoft.infrastructure.builder.Ecf41Builder;
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF;

public class EcfXmlMapper41 implements ExcelToEcfMapper<ECF> {
    @Override
    public ECF map(Sheet sheet) throws Exception {
        return new Ecf41Builder(sheet).build();
    }
}