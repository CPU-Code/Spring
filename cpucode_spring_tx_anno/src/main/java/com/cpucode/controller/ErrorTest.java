package com.cpucode.controller;

import com.cpucode.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 15:57
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ErrorTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService bean = app.getBean(AccountService.class);

        bean.errorTest("cpu", "cpuCode", 1000);
    }
}
