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
 * @time : 23:34
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class QueryTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * ge、gt、le、lt、isNull、isNotNull
     */
    @Test
    public void testOptimisticLocker() {
        QueryWrapper<User>queryWrapper = new QueryWrapper<>();

        queryWrapper.ge("age",21);
        //queryWrapper.gt("age",21);
        //queryWrapper.le("age",21);
        //queryWrapper.lt("age",21);
        //queryWrapper.isNull("age");
        //queryWrapper.isNotNull("age");

        int result = userMapper.delete(queryWrapper);

        System.out.println("delete return count = " + result);

    }
}
