package com.jong.service;

import org.springframework.stereotype.Service;

@Service
public class JongService {
    private String property;
    public JongService(){
        this.property = "jong";
    }

    public void jongServiceMethod(){
        System.out.println("jongServicemethod");
    }
}
