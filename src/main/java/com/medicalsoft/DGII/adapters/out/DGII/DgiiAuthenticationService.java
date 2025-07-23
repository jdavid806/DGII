package com.medicalsoft.DGII.adapters.out.DGII;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.medicalsoft.DGII.application.ports.out.DgiiAuthPort;
import com.medicalsoft.DGII.config.DgiiApiProperties;
import com.medicalsoft.DGII.shared.dtos.DgiiTokenResponse;
import com.medicalsoft.DGII.shared.utils.DgiiHttpClientService;
import com.medicalsoft.DGII.shared.utils.KeystoreLoader;
import com.medicalsoft.DGII.shared.utils.XmlSigner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class DgiiAuthenticationService implements DgiiAuthPort {

    private final KeystoreLoader keystoreLoader;
    private final DgiiApiProperties dgiiApiProperties;
    private final XmlSigner xmlSigner;
    private final DgiiHttpClientService dgiiHttpClientService;

    @Override
    @Cacheable("dgiiToken")
    public DgiiTokenResponse obtenerToken() {
        try {
            // 1. Obtener semilla
            URI urlSemilla = URI.create(dgiiApiProperties.getBaseUrl())
                    .resolve(dgiiApiProperties.getEndpoints().getAuth().getSeed());

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(urlSemilla)
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String semillaSinFirmar = response.body();

            // 2. Firmar la semilla
            String semillaFirmada = firmarSemilla(semillaSinFirmar);

            // 3. Validar semilla
            String respuestaTokenXml = validarSemilla(semillaFirmada);

            // 4. Convertir JSON a DTO
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(respuestaTokenXml);

            return new DgiiTokenResponse(
                    jsonNode.get("token").asText(),
                    ZonedDateTime.parse(jsonNode.get("expedido").asText()),
                    ZonedDateTime.parse(jsonNode.get("expira").asText()));

        } catch (Exception e) {
            log.error("Error en el flujo de autenticación con DGII", e);
            throw new RuntimeException("No se pudo obtener el token", e);
        }
    }

    private String firmarSemilla(String semillaXml) {
        try (InputStream p12Stream = keystoreLoader.loadKeystoreStream()) {
            return xmlSigner.sign(semillaXml, p12Stream, keystoreLoader.getPassword());
        } catch (Exception e) {
            log.error("Error firmando la semilla", e);
            throw new RuntimeException("No se pudo firmar la semilla", e);
        }
    }

    private String validarSemilla(String semillaFirmadaXml) {
        File tempFile = null;
        try {
            // Guardar temporalmente el XML firmado
            tempFile = File.createTempFile("semilla-firmada-", ".xml");
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                fos.write(semillaFirmadaXml.getBytes(StandardCharsets.UTF_8));
            }

            String url = dgiiApiProperties.getBaseUrl() +
                         dgiiApiProperties.getEndpoints().getAuth().getValidate();

            String respuesta = dgiiHttpClientService.sendSignedXml(tempFile, url, null);
            log.info("Respuesta validación semilla:\n{}", respuesta);
            return respuesta;

        } catch (Exception e) {
            log.error("Error al validar la semilla", e);
            throw new RuntimeException("No se pudo validar la semilla", e);
        } finally {
            if (tempFile != null && tempFile.exists()) {
                if (!tempFile.delete()) {
                    log.warn("No se pudo eliminar archivo temporal: {}", tempFile.getAbsolutePath());
                }
            }
        }
    }
}
