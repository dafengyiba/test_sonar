package com.example.demo;

import com.example.demo.service.TestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestS extends DemoApplicationTests{

    @Autowired
    private TestService testService;


    @Test
    void test(){
        String aa = testService.test1("aa");
        Assertions.assertEquals(aa, "aa","值不等于aa");
    }
    @Test
    void testaa(){
        String aa = testService.test1("cc");
        Assertions.assertEquals(aa, "bb","值不等于bb");
    }

}
