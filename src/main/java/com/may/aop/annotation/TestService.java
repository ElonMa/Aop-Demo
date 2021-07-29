package com.may.aop.annotation;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Action(name = "LogAspect")
    public void add() {
        System.out.println("执行add方法");
    }
}
