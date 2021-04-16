package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 15:21
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class GetByIdTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 根据id查询
     */
    @Test
    public void getById() {
        User user =
                mongoTemplate.findById("6079341e637cbb69ad961d0a", User.class);

        System.out.println(user);
    }

}
