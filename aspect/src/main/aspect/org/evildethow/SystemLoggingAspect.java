package org.evildethow;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SystemLoggingAspect {

    @Before("execution(* main(String[])) && args(args)")
    public void aaa(String[] args) {
        System.out.println("aspect before");
    }

    @After("execution(* main(String[])) && args(args)")
    public void bbb(String[] args) {
        System.out.println("aspect after");
    }
}
