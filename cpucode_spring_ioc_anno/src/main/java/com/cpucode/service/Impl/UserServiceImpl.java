package com.cpucode.service.Impl;

import com.cpucode.dao.UserDao;
import com.cpucode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 19:29
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

/**
 * <bean id="userService" class="com.cpucode.service.impl.UserServiceImpl">
 */

@Component("userService")
public class UserServiceImpl implements UserService {

    /**
     * <property name="userDao" ref="userDao"></property>
     */
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void save(){
        System.out.println("UserServiceImpl 中 save 跑起来了");

        userDao.save();
    }
}
