package com.wiley.ch8.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by david on 6/4/16.
 */
@Component
@Aspect
public class ExecutionTimeLoggingAspectJ {

    public Object profile(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.nanoTime();

        String className = proceedingJoinPoint.getClass().getCanonicalName();
        String methodName = proceedingJoinPoint.getSignature().getName();

        Object output = proceedingJoinPoint.proceed();
        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("Execution of " + className + "#" + methodName
                + " ended in " + new BigDecimal(elapsedTime).divide(
                new BigDecimal(1000000)) + " milliseconds");
        return output;
    }
}
