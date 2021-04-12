package com.cpucode.mybatis_plus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 22:50
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class SelectMapsPageTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() {
        //Page不需要泛型
        Page<Map<String, Object>> page = new Page<>(1, 5);
        Page<Map<String, Object>> pageParam = userMapper.selectMapsPage(page, null);
        List<Map<String, Object>> records = pageParam.getRecords();

        records.forEach(System.out::println);

        System.out.println(pageParam.getCurrent());
        System.out.println(pageParam.getPages());
        System.out.println(pageParam.getSize());
        System.out.println(pageParam.getTotal());
        System.out.println(pageParam.hasNext());
        System.out.println(pageParam.hasPrevious());
    }
}
