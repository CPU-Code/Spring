package com.cpucode.service.Impl;

import com.cpucode.dao.UserDao;
import com.cpucode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 19:29
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

/**
 * <bean id="userService" class="com.cpucode.service.impl.UserServiceImpl">
 * @Component("userService")
 * @Scope("prototype")
 */

@Service("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {
    @Value("${jdbc.driver}")
    private String driver;

    /**
     * <property name="userDao" ref="userDao"></property>
     *  @Autowired              //按照数据类型从Spring容器中进行匹配的
     *  @Qualifier("userDao")   //是按照id值从容器中进行匹配的 但是主要此处@Qualifier结合@Autowired一起使用
     */

    /**
     * @Resource 相当于 @Qualifier + @Autowired
     * */
    @Resource(name = "userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Service对象的销毁方法");
    }

    public void save(){
        System.out.println("UserServiceImpl 中 save 跑起来了");

        System.out.println("driver = " + driver);
        userDao.save();
    }
}
