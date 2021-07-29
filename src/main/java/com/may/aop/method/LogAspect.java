package com.may.aop.method;

import com.may.aop.annotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {

    @After("execution(* com.may.aop.method.TestService.*(..))")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("LogAspect after " );
    }

    @Before("execution(* com.may.aop.method.TestService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("LogAspect  before " );
    }

    @Around("execution(* com.may.aop.method.TestService.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[Aspect1] around advise1");
        pjp.proceed();
        System.out.println("[Aspect1] around advise2");
    }

    @AfterReturning("execution(* com.may.aop.method.TestService.*(..))")
    public void afterRunning(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("LogAspect  afterRunning " );
    }
    @AfterThrowing("execution(* com.may.aop.method.TestService.*(..))")
    public void AfterThrowing(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("LogAspect  afterThrowing " );
    }
}
