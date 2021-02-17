package com.cpucode.dao.impl;

import com.cpucode.dao.UserDao;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 11:39
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserDaoImpl implements UserDao {
    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printParameter(){
        System.out.println("UserDaoImpl 中 printNumber");

        System.out.println("username = " + username);
        System.out.println("age = " + age);
    }

    public UserDaoImpl(){
        System.out.println("UserDaoImpl 无参构造");
    }

    public void init(){
        System.out.println("UserDaoImpl 初始化");
    }

    public void destory(){
        System.out.println("UserDaoImpl 销毁");
    }

    public void save(){
        System.out.println("cpuCode 来了");
    }
}
