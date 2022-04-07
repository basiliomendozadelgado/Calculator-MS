package com.example.calculator.config;

import io.corp.calculator.TracerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfiguration {
    @Bean
    public TracerImpl getTracerImplement() {
        return new TracerImpl();
    }
}
