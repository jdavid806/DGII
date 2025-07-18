package com.medicalsoft.DGII.adapters.out.DGII;

import com.medicalsoft.DGII.application.ports.out.DgiiAuthPort;
import com.medicalsoft.DGII.config.DgiiApiProperties;
import com.medicalsoft.DGII.shared.utils.KeystoreLoader;
import com.medicalsoft.DGII.shared.utils.XmlSigner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@RequiredArgsConstructor
@Slf4j
public class DgiiAuthenticationService implements DgiiAuthPort {

    private final KeystoreLoader keystoreLoader;
    private final DgiiApiProperties dgiiApiProperties;
    private final XmlSigner xmlSigner;

    @Override
    public String obtenerToken() {
        try {
            // 1. Construir la URL
            URI urlSemilla = URI.create(dgiiApiProperties.getBaseUrl())
                    .resolve(dgiiApiProperties.getEndpoints().getAuth().getSeed());

            // 2. Crear cliente y petición GET
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(urlSemilla)
                    .GET()
                    .build();

            // 3. Enviar petición y obtener respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            log.info("Respuesta de DGII:\n{}", response.body());
            return response.body();

        } catch (Exception e) {
            log.error("Error al autenticar con la DGII", e);
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
        try {
            URI urlValidar = URI.create(dgiiApiProperties.getBaseUrl())
                    .resolve(dgiiApiProperties.getEndpoints().getAuth().getValidate());

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(urlValidar)
                    .header("Content-Type", "application/xml")
                    .POST(HttpRequest.BodyPublishers.ofString(semillaFirmadaXml))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            log.info("Respuesta validación semilla:\n{}", response.body());
            return response.body(); // XML con el token
        } catch (Exception e) {
            log.error("Error al validar la semilla", e);
            throw new RuntimeException("No se pudo validar la semilla", e);
        }
    }

}
