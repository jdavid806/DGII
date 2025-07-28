package com.medicalsoft.DGII.adapters.out.DGII;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.medicalsoft.DGII.application.ports.out.DgiiReceptionPort;
import com.medicalsoft.DGII.shared.dtos.DgiiResponseReception;
import com.medicalsoft.DGII.shared.utils.DgiiHttpClientService;
import com.medicalsoft.DGII.application.service.EcfXmlService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;

@Service
@RequiredArgsConstructor
@Slf4j
public class DgiiRecepcionService implements DgiiReceptionPort {

    private final EcfXmlService ecfXmlService;
    private final ObjectMapper objectMapper;

    @Override
    public DgiiResponseReception sendReception(InputStream excelInputStream, String token) {
        try {
            // 1. Procesar Excel y generar archivo XML firmado (retorna un File guardado en
            // disco)
            File xmlFirmado = ecfXmlService.procesarExcelYGenerarXml(excelInputStream);

            // 2. Construir URL y enviar archivo a DGII
            String url = "https://ecf.dgii.gov.do/certecf/recepcion/api/FacturasElectronicas";


            String respuesta = DgiiHttpClientService.sendSignedXml(xmlFirmado, url, token);
            log.info("Respuesta DGII recepción:\n{}", respuesta);

            // 3. Parsear respuesta a DTO
            return objectMapper.readValue(respuesta, DgiiResponseReception.class);

        } catch (Exception e) {
            log.error("Error al enviar XML firmado a la DGII", e);
            return new DgiiResponseReception(null, "500", "Error al enviar XML: " + e.getMessage());
        }
    }

}
