package com.jong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jong.service.JongService;

@Configuration
public class JongConfiguration {


    @Bean("configuredJongService")
    public JongService jongService() {
        return new JongService();
    }
}
