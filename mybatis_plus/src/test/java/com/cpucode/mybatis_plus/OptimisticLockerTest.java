package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 22:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class OptimisticLockerTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试乐观锁
     */
    @Test
    public void testOptimisticLocker() {
        //根据id查询
        User user = userMapper.selectById(1381614535189782530L);
        //修改
        user.setName("张三");
        userMapper.updateById(user);
    }
}
