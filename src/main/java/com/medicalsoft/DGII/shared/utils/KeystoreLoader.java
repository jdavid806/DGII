package com.medicalsoft.DGII.shared.utils;

import com.medicalsoft.DGII.config.KeystoreProperties;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

@Component
@RequiredArgsConstructor
@Slf4j
public class KeystoreLoader {

    private final KeystoreProperties keystoreProperties;

    @Getter
    private X509Certificate certificate;

    @Getter
    private PrivateKey privateKey;

    @PostConstruct
    public void init() {
        try {
            KeyStore keystore = KeyStore.getInstance("PKCS12");
            InputStream is = getClass().getClassLoader().getResourceAsStream(keystoreProperties.getPath());
            if (is == null) {
                throw new RuntimeException(
                        "No se encontró el archivo P12 en resources: " + keystoreProperties.getPath());
            }

            keystore.load(is, keystoreProperties.getPassword().toCharArray());

            String alias = keystore.aliases().nextElement(); // asumimos solo 1 alias
            certificate = (X509Certificate) keystore.getCertificate(alias);
            privateKey = (PrivateKey) keystore.getKey(alias, keystoreProperties.getPassword().toCharArray());

            log.info("Certificado y clave privada cargados correctamente.");

        } catch (Exception e) {
            throw new RuntimeException("Error al cargar el archivo P12", e);
        }
    }

    public InputStream loadKeystoreStream() {
        InputStream is = getClass().getClassLoader().getResourceAsStream(keystoreProperties.getPath());
        if (is == null) {
            throw new RuntimeException("No se encontró el archivo P12 en resources: " + keystoreProperties.getPath());
        }
        return is;
    }

    public String getPassword() {
        return keystoreProperties.getPassword();
    }

}
