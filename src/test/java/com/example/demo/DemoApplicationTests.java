package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;

@SpringBootTest
@Controller
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public  class DemoApplicationTests {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplicationTests.class,args);

        System.out.println("test");
    }

}
