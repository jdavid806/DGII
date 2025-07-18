package com.medicalsoft.DGII;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.medicalsoft.DGII.config.DgiiApiProperties;

@SpringBootApplication
@EnableConfigurationProperties(DgiiApiProperties.class)
public class DgiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DgiiApplication.class, args);
	}

}
