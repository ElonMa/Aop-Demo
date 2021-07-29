package com.may.aop.method;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public void add() {
        System.out.println("执行add方法");
    }
}
