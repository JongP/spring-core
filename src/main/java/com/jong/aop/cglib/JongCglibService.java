package com.jong.aop.cglib;

import org.springframework.stereotype.Service;

@Service
public class JongCglibService {

    public void method(){
        System.out.println("cglib method");
    }

}
