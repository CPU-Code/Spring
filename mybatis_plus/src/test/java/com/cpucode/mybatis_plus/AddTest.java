package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 20:18
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class AddTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAll() {
        User user = new User();

        user.setName("lucy");
        user.setAge(20);
        user.setEmail("923992029@qq.com");

        int insert = userMapper.insert(user);

        System.out.println(insert);

    }
}
