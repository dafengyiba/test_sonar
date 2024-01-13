package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public void test1() {
        System.out.println("this code will be test");
    }

    @Override
    public void test2() {
        System.out.println("this code will not be tested");
    }
}
