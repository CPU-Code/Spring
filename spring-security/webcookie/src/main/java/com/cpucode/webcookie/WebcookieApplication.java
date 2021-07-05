package com.cpucode.webcookie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cpucode.webcookie.mapper")
public class WebcookieApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebcookieApplication.class, args);
    }

}
