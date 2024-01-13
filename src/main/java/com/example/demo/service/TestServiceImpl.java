package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public String test1(String aa) {
        System.out.println("this code will be test");
        if ("aa".equals(aa)){
            return aa;
        }else {
            return "bb";
        }
    }

    @Override
    public void test2() {
        System.out.println("this code will not be tested");
    }
}
