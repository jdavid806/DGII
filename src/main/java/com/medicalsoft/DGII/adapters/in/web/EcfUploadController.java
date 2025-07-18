package com.medicalsoft.DGII.adapters.in.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.medicalsoft.DGII.application.service.EcfXmlService;

import java.io.File;

@RestController
@RequestMapping("/v1/")
public class EcfUploadController {

    @Autowired
    private EcfXmlService ecfXmlService;

    @PostMapping("upload-excel")
    public ResponseEntity<FileSystemResource> uploadExcel(@RequestParam("file") MultipartFile file) throws Exception {
        File xmlFile = ecfXmlService.procesarExcelYGenerarXml(file.getInputStream());

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + xmlFile.getName())
                .contentType(MediaType.APPLICATION_XML)
                .body(new FileSystemResource(xmlFile));
    }
}
