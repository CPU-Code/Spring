package cpucode.service.impl;

import cpucode.dao.UserDao;
import cpucode.service.UserService;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 16:07
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserServiceAggregateImpl implements UserService {
    private UserDao userDao;

    public UserServiceAggregateImpl() {
        System.out.println("UserServiceAggregateImpl 无参构造");
    }

    public UserServiceAggregateImpl(UserDao userDao){
        System.out.println("UserServiceAggregateImpl 有参构造");

        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao){
        System.out.println("UserServiceAggregateImpl 中的 setUserDao");

        this.userDao = userDao;
    }

    public void save(){
        System.out.println("UserServiceAggregateImpl 调用 save");

        userDao.printAggregate();
    }
}
