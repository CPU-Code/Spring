package com.cpucode.weberror;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cpucode.weberror.mapper")
public class WeberrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeberrorApplication.class, args);
    }

}
