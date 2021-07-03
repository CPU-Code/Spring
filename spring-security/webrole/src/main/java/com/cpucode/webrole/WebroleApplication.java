package com.cpucode.webrole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cpucode.webrole.mapper")
public class WebroleApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebroleApplication.class, args);
    }

}
