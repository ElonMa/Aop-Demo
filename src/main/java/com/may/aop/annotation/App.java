package com.may.aop.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        TestService demoAnnotationService = context.getBean(TestService.class);
        demoAnnotationService.add();//基于注解的拦截
        context.close();
    }
}
