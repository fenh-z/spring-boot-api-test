package com.example.springbootapitest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
//@MapperScan(
//        basePackages = "com.example.springbootapitest.dao",
//        annotationClass = Repository.class
//)
public class SpringBootApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApiTestApplication.class, args);
    }

}
