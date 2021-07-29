package com.may.aop.annotation;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LogAspect {
    @Pointcut("@annotation(com.may.aop.annotation.Action)")
    public void annotationPointCut() {
    }
    
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("LogAspect after " );
    }

    @Before("annotationPointCut()")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("LogAspect  before " );
    }

    @Around("annotationPointCut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[Aspect1] around advise1");
        pjp.proceed();
        System.out.println("[Aspect1] around advise2");
    }

    @AfterReturning("annotationPointCut()")
    public void afterRunning(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("LogAspect  afterRunning " );
    }
    @AfterThrowing("annotationPointCut()")
    public void AfterThrowing(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("LogAspect  afterThrowing " );
    }
}
