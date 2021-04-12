package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 23:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class DeleteByMapTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() {
        HashMap<String, Object> map = new HashMap<>();

        map.put("name", "lucy");
        map.put("age", 20);

        int result = userMapper.deleteByMap(map);

        System.out.println(result);
    }
}
