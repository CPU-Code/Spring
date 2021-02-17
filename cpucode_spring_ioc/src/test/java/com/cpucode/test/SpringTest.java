package com.cpucode.test;

import com.cpucode.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 11:52
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SpringTest {

    /**
     * 测试scope属性
     * */
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("userDaoSingle.xml");

        //上面执行完毕就会创建bean

        UserDao userDao = (UserDao) app.getBean("userDaoSingle");
        UserDao userDao2 = (UserDao) app.getBean("userDaoSingle");

        System.out.println(userDao);
        System.out.println(userDao2);
    }
}

/**
 * com.cpucode.dao.impl.UserDaoImpl@17579e0f
 * com.cpucode.dao.impl.UserDaoImpl@17579e0f
 * */