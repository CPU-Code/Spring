package com.cpucode.demo;

import com.cpucode.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 15:25
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserControllerPara {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("userControllerPara.xml");

        UserService userService = (UserService) app.getBean("userServiceSetImpl");

        userService.save();
    }
}
