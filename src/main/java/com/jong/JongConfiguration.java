package com.jong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jong.service.JongService;

@Configuration
public class JongConfiguration {


    @Profile("!jong")
    @Bean("configuredJongService")
    public JongService jongService() {
        return new JongService();
    }

    @Profile("jong")
    @Bean("configuredJongServiceWithProfile")
    public JongService jongServiceWithProfile() {
        return new JongService();
    }
}
