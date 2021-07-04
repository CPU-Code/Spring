package com.cpucode.websecured.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

/**
 * @author : cpucode
 * @date : 2021/7/3
 * @time : 21:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    UserDetailsService userDetailsService;

    /**
     * 实现用户身份认证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
    }

    /**
     *  注入 PasswordEncoder 类到 spring 容器中
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    /**
     * 配置url的访问权限
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //配置没有权限访问跳转自定义页面
        http.exceptionHandling().accessDeniedPage("/unauth.html");

        //自定义自己编写的登录页面
        http.formLogin()
                //登录页面设置
                .loginPage("/login.html")
                //登录访问路径
                .loginProcessingUrl("/user/login")
                //登录成功之后，跳转路径
                .defaultSuccessUrl("/text/index").permitAll()
                .and().authorizeRequests()
                // //设置哪些路径可以直接访问，不需要认证
                .antMatchers("/", "/text/hello", "/user/login").permitAll()
                .anyRequest().authenticated()
                // 关闭scrf 防护
                .and().csrf().disable();
    }
}
