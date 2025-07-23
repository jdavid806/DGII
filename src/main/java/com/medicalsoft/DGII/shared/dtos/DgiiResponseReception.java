package com.medicalsoft.DGII.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DgiiResponseReception {
    private String trackId;
    private String error;
    private String mensaje;
}
