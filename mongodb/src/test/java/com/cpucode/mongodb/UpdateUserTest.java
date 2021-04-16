package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import com.mongodb.client.result.UpdateResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 16:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class UpdateUserTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 修改
     */
    @Test
    public void updateUser() {
        User user = mongoTemplate.findById("6079341e637cbb69ad961d0a", User.class);

        user.setName("cpucode");
        user.setAge(11);
        user.setEmail("923992029@qq.com");

        Query query = new Query(Criteria.where("_id").is(user.getId()));

        Update update = new Update();
        update.set("name", user.getName());
        update.set("age", user.getAge());
        update.set("email", user.getEmail());

        UpdateResult result = mongoTemplate.upsert(query, update, User.class);
        long count = result.getModifiedCount();
        System.out.println(count);

        user = mongoTemplate.findById("6079341e637cbb69ad961d0a", User.class);

        System.out.println(user);
    }

}
