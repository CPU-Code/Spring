package com.cpucode.demo;

import com.cpucode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 15:40
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserControllerOrdinary {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("userControllerOrdinary.xml");

        UserService userService = (UserService) app.getBean("UserControllerOrdinary");

        userService.save();
    }
}
