package com.cpucode.factory;

import com.cpucode.dao.UserDao;
import com.cpucode.dao.impl.UserDaoImpl;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 12:39
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        System.out.println("StaticFactory 调用getUserDao ");

        return new UserDaoImpl();
    }
}
