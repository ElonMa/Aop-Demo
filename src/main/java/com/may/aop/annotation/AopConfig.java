package com.may.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.may.aop.annotation")
@EnableAspectJAutoProxy
public class AopConfig {

}
