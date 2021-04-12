package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 23:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class LogicDeleteSelectTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() {
        List<User> users = userMapper.selectList(null);

        users.forEach(System.out::println);
    }

}
