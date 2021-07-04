package com.cpucode.weblogout;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cpucode.weblogout.mapper")
public class WeblogoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeblogoutApplication.class, args);
    }

}
