package com.cpucode.controller;

import com.cpucode.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 14:41
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AccountController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService= app.getBean(AccountService.class);

        accountService.transfer("cpu", "cpuCode", 500);
    }
}
