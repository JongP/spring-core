package com.jong.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("jong")
@Service
public class ProfileJongService {
    public String getProfileMessage() {
        return "This is the Jong profile service.";
    }

    public String getProfileName() {
        return "jong";
    }
}
