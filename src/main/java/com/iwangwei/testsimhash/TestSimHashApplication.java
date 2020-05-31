package com.iwangwei.testsimhash;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.iwangwei.testsimhash.dao")
public class TestSimHashApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSimHashApplication.class, args);
    }

}
