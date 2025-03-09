package com.jong.aop.dynamicProxy;

import org.springframework.stereotype.Service;

@Service
public class JongAopService implements AOPService{
    public JongAopService() {
        System.out.println("JongAopService constructor");
    }

    @Override
    public void service() {
        System.out.println("JongAopService method");
    }
}
