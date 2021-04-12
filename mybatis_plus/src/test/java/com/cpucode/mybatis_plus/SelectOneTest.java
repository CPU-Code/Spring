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
 * @date : 2021/4/12
 * @time : 23:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class SelectOneTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * eq、ne
     */
    @Test
    public void testSelectOne() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        //queryWrapper.eq("name", "Tom");
        queryWrapper.ne("id", 4L);

        //只能返回一条记录，多余一条则抛出异常
        List<User> user = userMapper.selectList(queryWrapper);

        System.out.println(user);
    }

}
