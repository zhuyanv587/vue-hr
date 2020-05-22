package com.example.vue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.vue.mapper")
public class VueHrApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueHrApplication.class, args);
    }

}
