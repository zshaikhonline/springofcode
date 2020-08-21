package com.springofcode.springofcode.services;

import com.springofcode.springofcode.service.HelloService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    HelloService helloService;

    @DisplayName("Test spring @Autowired annotation")
    @Test
    void testGet(){

        assertEquals("Hello junit 5", helloService.get());
    }

}
