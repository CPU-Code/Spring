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
 * @time : 15:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class FindUserTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 查询所有
     */
    @Test
    public void findUser(){
        List<User> userList = mongoTemplate.findAll(User.class);

        System.out.println(userList);
    }
}
