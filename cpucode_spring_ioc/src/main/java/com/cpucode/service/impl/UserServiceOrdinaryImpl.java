package com.cpucode.service.impl;

import com.cpucode.dao.UserDao;
import com.cpucode.service.UserService;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 15:47
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserServiceOrdinaryImpl implements UserService{
    private UserDao userDao;

    public UserServiceOrdinaryImpl() {
        System.out.println("UserServiceSetImpl 无参构造");
    }

    public UserServiceOrdinaryImpl(UserDao userDao){
        System.out.println("UserServiceSetImpl 有参构造");

        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao){
        System.out.println("UserServiceSetImpl 中的 setUserDao");

        this.userDao = userDao;
    }

    public void save(){
        System.out.println("UserServiceSetImpl 调用 save");

        userDao.printParameter();
    }
}
