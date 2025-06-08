package com.jong;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //AnnotationConfigServletWebServerApplicationContext
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        //AOPService s = (AOPService) applicationContext.getBean("jongAopService");
        //s.service();

        System.out.println("applicationContext run");
    }
}
