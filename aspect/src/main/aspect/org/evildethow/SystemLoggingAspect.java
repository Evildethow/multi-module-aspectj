package org.evildethow;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SystemLoggingAspect {

    @Pointcut("execution(* main(..))")
    public void defineEntryPoint() {
    }

    @Before("defineEntryPoint()")
    public void aaa(JoinPoint joinPoint) {
        System.out.println("aspect before");
    }

    @After("defineEntryPoint()")
    public void bbb(JoinPoint joinPoint) {
        System.out.println("aspect after");
    }
}
