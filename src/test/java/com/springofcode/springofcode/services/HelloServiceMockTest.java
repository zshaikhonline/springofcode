package com.springofcode.springofcode.services;

import com.springofcode.springofcode.repository.HelloRepository;
import com.springofcode.springofcode.service.HelloService;
import com.springofcode.springofcode.service.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class HelloServiceMockTest {
    @Mock
    private HelloRepository helloRepository;

    @InjectMocks    //auto inject hellorepository
    private HelloService helloService = new HelloServiceImpl();

    @BeforeEach
    void setMockOutput() {
        when(helloRepository.get()).thenReturn("Hello Mockito From Repository");
    }
        @DisplayName("test mock helloservice+hellorepository")
        @Test
        void testGet(){
            assertEquals("Hello Mockito From Repository",helloService.get());
        }
    }
