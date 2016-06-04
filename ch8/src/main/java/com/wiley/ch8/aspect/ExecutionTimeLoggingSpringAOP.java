package com.wiley.ch8.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * Created by david on 6/3/16.
 */
@Component
@Aspect
public class ExecutionTimeLoggingSpringAOP implements MethodBeforeAdvice, AfterReturningAdvice{

    long startTime = 0;

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        startTime = System.nanoTime();
    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        long elapsedTime = System.nanoTime();
        String className = target.getClass().getCanonicalName();
        String methodName = method.getName();
        System.out.println("Execution of " + className
                + "#" + methodName + " ended in "
                + new BigDecimal(elapsedTime).divide(new BigDecimal(1000000)) + " milliseconds");
    }

    @Before("execution(public * * (..))")
    public void before(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getCanonicalName();
        System.out.println("test");
    }
}
