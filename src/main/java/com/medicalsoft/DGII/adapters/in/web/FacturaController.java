package com.medicalsoft.DGII.adapters.in.web;

import com.medicalsoft.DGII.application.ports.out.DgiiAuthPort;
import com.medicalsoft.DGII.shared.dtos.DgiiTokenResponse;
import com.medicalsoft.DGII.shared.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
@RequiredArgsConstructor
public class FacturaController {

    private final DgiiAuthPort dgiiAuthPort;

    @GetMapping("auth-token")
    public ResponseEntity<ApiResponse<DgiiTokenResponse>> obtenerToken() {
        DgiiTokenResponse token = dgiiAuthPort.obtenerToken();
        ApiResponse<DgiiTokenResponse> response = new ApiResponse<>(
                200,
                "Token generado correctamente",
                token
        );
        return ResponseEntity.ok(response);
    }
}
