package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 23:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class LogicDeleteTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * 逻辑删除
     */
    @Test
    public void test1(){
        int result = userMapper.deleteById(3L);

        System.out.println(result);
    }
}
