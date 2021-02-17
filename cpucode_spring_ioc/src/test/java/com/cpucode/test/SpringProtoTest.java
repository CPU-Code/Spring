package com.cpucode.test;

import com.cpucode.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 12:04
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SpringProtoTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao)app.getBean("userDaoProto");
        UserDao userDao2 = (UserDao)app.getBean("userDaoProto");

        System.out.println(userDao);
        System.out.println(userDao2);
    }
}

/**
 * com.cpucode.dao.impl.UserDaoImpl@2d8f65a4
 * com.cpucode.dao.impl.UserDaoImpl@1b68ddbd
 * */
