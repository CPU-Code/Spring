package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 23:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class DeleteByIdTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id删除记录
     */
    @Test
    public void test1(){
        int result = userMapper.deleteById(1381613330527006721L);
        System.out.println(result);
    }
}
