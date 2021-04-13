package com.cpucode.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * @author : cpucode
 * @date : 2021/4/13
 * @time : 8:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class SelectMapsTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * like、notLike、likeLeft、likeRight
     */
    @Test
    public void test1() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        //queryWrapper.select("name", "age");
        //queryWrapper.like("name", "e");
        //queryWrapper.notLike("name", "e");
        //queryWrapper.likeLeft("email", "9");
        queryWrapper.likeRight("email", "9");

        //返回值是Map列表
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);

        maps.forEach(System.out::println);
    }

}
