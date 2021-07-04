package com.cpucode.websecured;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan("com.cpucode.websecured.mapper")
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class WebsecuredApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsecuredApplication.class, args);
    }

}
