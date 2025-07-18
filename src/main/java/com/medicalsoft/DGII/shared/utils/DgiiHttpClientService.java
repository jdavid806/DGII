package com.medicalsoft.DGII.shared.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import java.nio.charset.StandardCharsets;

@Slf4j
@Service
public class DgiiHttpClientService {

    private final WebClient webClient;

    public DgiiHttpClientService(WebClient.Builder builder) {
        this.webClient = builder.build();
    }

    public String sendSignedXml(String xmlString, String url) {
        try {
            MultipartBodyBuilder builder = new MultipartBodyBuilder();
            builder.part("xml", xmlString.getBytes(StandardCharsets.UTF_8))
                   .filename("semilla_firmada.xml")
                   .contentType(MediaType.TEXT_XML);

            log.info("Enviando XML firmado a DGII. URL: {}", url);

            return webClient.post()
                    .uri(url)
                    .contentType(MediaType.MULTIPART_FORM_DATA)
                    .accept(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromMultipartData(builder.build()))
                    .retrieve()
                    .bodyToMono(String.class)
                    .doOnError(e -> log.error("Error enviando XML a DGII", e))
                    .block(); // Esperar resultado síncronamente (como RestTemplate)

        } catch (Exception e) {
            log.error("Error enviando XML a DGII", e);
            throw new RuntimeException("Fallo en la comunicación con DGII", e);
        }
    }
}
