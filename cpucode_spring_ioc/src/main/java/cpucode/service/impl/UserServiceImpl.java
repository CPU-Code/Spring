package cpucode.service.impl;

import cpucode.dao.UserDao;
import cpucode.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 13:28
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserServiceImpl implements UserService {
    public UserServiceImpl(){
        System.out.println("UserServiceImpl 无参构造");
    }

    public void save() {
        System.out.println("UserServiceImpl 的save方法");

        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("userService.xml");

        UserDao userDao = (UserDao) app.getBean("userDao");

        userDao.save();

    }
}
