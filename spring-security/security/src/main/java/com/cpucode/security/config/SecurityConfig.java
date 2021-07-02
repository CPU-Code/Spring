package com.cpucode.security.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;

/**
 * @author : cpucode
 * @date : 2021/7/2
 * @time : 17:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.formLogin()                 // 表单登录
                .and()
                .authorizeRequests()     // 认证配置
                .anyRequest()            // 任何请求
                .authenticated();        // 都需要身份验证
    }
}
