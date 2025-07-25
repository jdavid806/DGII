package com.medicalsoft.DGII;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

import com.medicalsoft.DGII.config.DgiiApiProperties;

@SpringBootApplication
@EnableCaching
@EnableConfigurationProperties(DgiiApiProperties.class)
public class DgiiApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DgiiApplication.class, args);
		
	}

}
