package com.cpucode.web;

import com.cpucode.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 19:55
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserControllerAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app  = new ClassPathXmlApplicationContext("userControllerAnnotation.xml");

        UserService userService = (UserService) app.getBean("userService");

        userService.save();
    }
}
