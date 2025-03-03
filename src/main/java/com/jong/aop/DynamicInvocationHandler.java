package com.jong.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;





public class DynamicInvocationHandler implements InvocationHandler {
    private Object delegate;

    public DynamicInvocationHandler(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.nanoTime();
        method.invoke(delegate, args);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(method.getName() + " : " + estimatedTime + "ns");
        return null;
    }
}
