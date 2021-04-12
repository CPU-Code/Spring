package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 22:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class SelectIdTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 多个id批量查询
     */
    @Test
    public void test1() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));

        System.out.println(users);
    }

}
