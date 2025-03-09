package com.jong.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jong.aop.dynamicProxy.AOPService;
import com.jong.aop.dynamicProxy.JongAopService;
import com.jong.service.JongService;

@RestController
public class JongController {

    @Autowired
    private JongService jongService;

    @Autowired
    private AOPService aopService;

    @GetMapping("/jong")
    public String myGet(){
        jongService.jongServiceMethod();
        System.out.println("myGet");
        return "test return value";
    }

    @PostConstruct
    public void test(){
        aopService.service();
    }



    public void setJongService(JongService jongService){
        this.jongService=jongService;
    }


}
