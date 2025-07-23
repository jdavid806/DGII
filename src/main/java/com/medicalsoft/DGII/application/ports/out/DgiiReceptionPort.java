package com.medicalsoft.DGII.application.ports.out;

import java.io.InputStream;

import com.medicalsoft.DGII.shared.dtos.DgiiResponseReception;

public interface DgiiReceptionPort {
    DgiiResponseReception sendReception(InputStream excelInputStream, String token);
}
