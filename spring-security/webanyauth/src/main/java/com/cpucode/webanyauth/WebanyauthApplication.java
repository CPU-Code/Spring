package com.cpucode.webanyauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cpucode.webanyauth.mapper")
public class WebanyauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebanyauthApplication.class, args);
    }

}
