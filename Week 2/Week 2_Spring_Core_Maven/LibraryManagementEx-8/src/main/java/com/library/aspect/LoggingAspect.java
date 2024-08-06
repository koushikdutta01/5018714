package com.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library.BookService.printS(..))")
    public void logBefore() {
        System.out.println("LoggingAspect called before the method Starts");
    }

    @After("execution(* com.library.BookService.printS(..))")
    public void logAfter() {
        System.out.println("LoggingAspect called after the method has finished");
    }
}
