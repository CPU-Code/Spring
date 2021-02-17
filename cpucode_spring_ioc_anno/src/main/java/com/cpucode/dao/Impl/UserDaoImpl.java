package com.cpucode.dao.Impl;

import com.cpucode.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 19:27
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
/**
 * <bean id="userDao" class="com.cpucode.dao.impl.UserDaoImpl"></bean>
 * @Component("userDao")
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("UserDaoImpl 中 save 跑了");
    }
}
