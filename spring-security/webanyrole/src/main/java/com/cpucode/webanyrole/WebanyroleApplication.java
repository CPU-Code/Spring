package com.cpucode.webanyrole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cpucode.webanyrole.mapper")
public class WebanyroleApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebanyroleApplication.class, args);
    }

}
