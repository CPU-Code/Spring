package com.cpucode.test;

import com.cpucode.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 12:41
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class StaticFactoryTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dynamicFactory.xml");

        UserDao userDao = (UserDao) app.getBean("staticFactory");

        System.out.println(userDao);
    }
}
