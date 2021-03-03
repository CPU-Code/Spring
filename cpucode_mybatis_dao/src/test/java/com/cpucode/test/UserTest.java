package com.cpucode.test;

import com.cpucode.dao.UserDao;
import com.cpucode.dao.impl.UserDaoImpl;
import com.cpucode.domain.User;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/3
 * @time : 13:15
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserTest {
    @Test
    public void test1() throws IOException {
        UserDao userDao = new UserDaoImpl();

        List<User> all = userDao.findAll();

        System.out.println(all);
    }

}
