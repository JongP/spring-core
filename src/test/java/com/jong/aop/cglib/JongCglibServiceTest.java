package com.jong.aop.cglib;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.FixedValue;

public class JongCglibServiceTest {

    @Test
    public void jong(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(JongCglibService.class);
        enhancer.setCallbacks(new FixedValue[] { () -> "jongHae" });

        JongCglibService proxy = (JongCglibService) enhancer.create();

        proxy.method();

    }
}
