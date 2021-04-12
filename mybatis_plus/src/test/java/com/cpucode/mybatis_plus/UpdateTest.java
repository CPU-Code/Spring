package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 20:45
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class UpdateTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUpdate() {
        User user = new User();

        user.setId(1381583169232400386L);
        user.setName("lucymary");

        int count = userMapper.updateById(user);

        System.out.println(count);
    }

}
