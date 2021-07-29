package com.may.aop.method;

import com.may.aop.annotation.AopConfig;
import com.may.aop.annotation.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        TestService testService = context.getBean(TestService.class);
        testService.add();
        context.close();
    }
}
