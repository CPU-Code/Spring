package com.cpucode.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 23:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class SelectCountTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * 范围查询
     */
    @Test
    public void test1() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.between("age", 20, 30);
        //queryWrapper.notBetween("age", 20, 30);

        //返回数据数量
        Integer count = userMapper.selectCount(queryWrapper);

        System.out.println(count);

    }
}
