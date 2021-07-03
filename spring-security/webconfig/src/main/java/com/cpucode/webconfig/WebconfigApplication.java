package com.cpucode.webconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
public class WebconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebconfigApplication.class, args);
    }

}
