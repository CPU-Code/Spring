package com.cpucode.mybatis_plus;

import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 23:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class DeleteBatchIdsTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * 批量删除
     */
    @Test
    public void test1(){
        int result = userMapper.deleteBatchIds(Arrays.asList(1381613505626542081L, 1381614000973934594L));

        System.out.println(result);
    }
}
