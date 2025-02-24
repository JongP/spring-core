package com.jong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jong.service.JongService;

@RestController
public class JongController {

    @Autowired
    private JongService jongService;

    @GetMapping("/jong")
    public void myGet(){
        jongService.jongServiceMethod();
        System.out.println("myGet");
    }



    public void setJongService(JongService jongService){
        this.jongService=jongService;
    }


}
