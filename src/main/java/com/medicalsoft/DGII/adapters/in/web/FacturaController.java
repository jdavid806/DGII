package com.medicalsoft.DGII.adapters.in.web;

import com.medicalsoft.DGII.application.ports.out.DgiiAuthPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
@RequiredArgsConstructor
public class FacturaController {

    private final DgiiAuthPort dgiiAuthPort;

    @GetMapping("auth-token")
    public String obtenerToken() {
        return dgiiAuthPort.obtenerToken();
    }
}
