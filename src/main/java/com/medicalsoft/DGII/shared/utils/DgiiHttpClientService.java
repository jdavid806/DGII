package com.medicalsoft.DGII.shared.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class DgiiHttpClientService {

    public static String sendSignedXml(File xmlFile, String url, String token) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            HttpPost post = new HttpPost(url);
            FileBody fileBody = new FileBody(xmlFile, ContentType.APPLICATION_XML);

            HttpEntity entity = MultipartEntityBuilder.create()
                    .addPart("xml", fileBody)
                    .build();

            post.setEntity(entity);
            post.setHeader("Content-Type", entity.getContentType().getValue());

            if (token != null && !token.isBlank()) {
                post.setHeader("Authorization", "Bearer " + token);
            }

            System.out.println("Enviando archivo a DGII con Content-Length: " + entity.getContentLength());

            HttpResponse response = httpClient.execute(post);

            return new String(response.getEntity().getContent().readAllBytes());

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error enviando XML a DGII", e);
        }
    }
}


//DgiiHttpClientService