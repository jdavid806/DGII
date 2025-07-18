package com.medicalsoft.DGII.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "dgii.p12")
public class KeystoreProperties {
    private String path;
    private String password;
}
