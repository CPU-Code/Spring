package com.cpucode.service.Impl;

import com.cpucode.dao.UserDao;
import com.cpucode.service.UserService;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 19:29
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void save(){
        System.out.println("UserServiceImpl 中 save 跑起来了");

        userDao.save();
    }
}
