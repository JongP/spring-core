package com.jong.aop.cglib;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class CglibAspect {

    @Around("execution(* com.jong.aop.cglib.JongCglibService.method(..))")
    public Object myLog(ProceedingJoinPoint pjp) throws Throwable {
      log.info("start - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());
        return pjp.proceed();
    }


}
