package com.medicalsoft.DGII.domain.interfaces;
import org.apache.poi.ss.usermodel.Sheet;

public interface ExcelToEcfMapper<T> {
    T map(Sheet sheet) throws Exception;
}