package com.example.demo;

import com.example.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestS extends DemoApplicationTests{

    @Autowired
    private TestService testService;


    @Test
    void test(){
        testService.test1();
    }

}
