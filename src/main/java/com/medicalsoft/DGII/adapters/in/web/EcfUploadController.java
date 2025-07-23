package com.medicalsoft.DGII.adapters.in.web;

import java.io.InputStream;

import org.apache.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.medicalsoft.DGII.application.ports.out.DgiiReceptionPort;

import com.medicalsoft.DGII.shared.dtos.DgiiResponseReception;
import com.medicalsoft.DGII.shared.responses.ApiResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/")
@RequiredArgsConstructor
public class EcfUploadController {

    private final DgiiReceptionPort dgiiReceptionPort;

    @PostMapping(value = "/upload-excel", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ApiResponse<DgiiResponseReception>> uploadExcel(
            @RequestPart("excelInputStream") MultipartFile excelFile,
            @RequestHeader("Authorization") String authorization) {

        try (InputStream is = excelFile.getInputStream()) {
            String token = authorization.replace("Bearer ", "");
            DgiiResponseReception response = dgiiReceptionPort.sendReception(is, token);
            return ResponseEntity.ok(new ApiResponse<>(200, "XML enviado correctamente", response));
        } catch (Exception e) {
                   return ResponseEntity.status(HttpStatus.SC_INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse<>(500, "Error procesando el archivo Excel", null));
        }
    }

}
