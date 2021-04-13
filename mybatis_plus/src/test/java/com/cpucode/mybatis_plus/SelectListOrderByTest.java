package com.cpucode.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/4/13
 * @time : 8:48
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class SelectListOrderByTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        //queryWrapper.orderByDesc("id");
        //queryWrapper.orderByAsc("id");
        queryWrapper.orderBy(true,true,"id");

        List<User> users = userMapper.selectList(queryWrapper);

        users.forEach(System.out::println);

    }
}
