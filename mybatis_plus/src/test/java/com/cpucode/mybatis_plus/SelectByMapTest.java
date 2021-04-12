package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 22:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class SelectByMapTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * 简单条件查询
     */
    @Test
    public void test1() {
        Map<String, Object> columnMap = new HashMap<>();

        columnMap.put("name", "Jack");
        columnMap.put("age", 20);

        List<User> users = userMapper.selectByMap(columnMap);

        System.out.println(users);
    }
}
