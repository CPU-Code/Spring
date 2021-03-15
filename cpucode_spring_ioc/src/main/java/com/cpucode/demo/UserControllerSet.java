package com.cpucode.demo;

import com.cpucode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 14:09
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserControllerSet {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("userServiceSet.xml");

        UserService userService = (UserService) app.getBean("userServiceSet");

        userService.save();
    }
}
