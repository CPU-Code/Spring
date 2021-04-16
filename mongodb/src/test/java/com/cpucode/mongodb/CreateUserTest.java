package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 14:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class CreateUserTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 添加
     */
    @Test
    public void test1(){
        User user = new User();

        user.setAge(20);
        user.setName("test");
        user.setEmail("923992029@qq.com");

        User user1 = mongoTemplate.insert(user);

        System.out.println(user1);
    }
}
