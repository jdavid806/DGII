package com.medicalsoft.DGII.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Profile("dev") // solo aplica si el perfil activo es "dev"
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // desactiva CSRF
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()); // permite todo

        return http.build();
    }
}
