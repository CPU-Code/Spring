package com.cpucode.service.impl;

import com.cpucode.dao.UserDao;
import com.cpucode.service.UserService;

/**
 * @author : cpucode
 * @date : 2021/2/21
 * @time : 22:42
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("UserServiceImpl 启动了");

        userDao.save();
    }
}
