package com.cpucode.demo;

import com.cpucode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 14:32
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserControllerSetP {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("userServiceSetP.xml");

        UserService userService = (UserService) app.getBean("userServiceSetP");

        userService.save();
    }
}
