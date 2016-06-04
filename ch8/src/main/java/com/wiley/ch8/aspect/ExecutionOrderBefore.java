package com.wiley.ch8.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by david on 6/3/16.
 */
@Component
@Aspect
public class ExecutionOrderBefore {

    @Before(value = "execution(public * * (..))")
    public void before(JoinPoint joinPoint, String param){
       System.out.println("Before Advice. Argument: " + param);
    }
}
