package com.medicalsoft.DGII.application.ports.out;

import com.medicalsoft.DGII.shared.dtos.DgiiTokenResponse;

public interface DgiiAuthPort {
    DgiiTokenResponse obtenerToken();
}
