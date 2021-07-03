package com.cpucode.webauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cpucode.webauth.mapper")
public class WebauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebauthApplication.class, args);
    }

}
