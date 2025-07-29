package com.medicalsoft.DGII.application.ports.input;
import org.apache.poi.ss.usermodel.Sheet;

public interface ExcelToEcfMapper<T> {
    T map(Sheet sheet) throws Exception;
}