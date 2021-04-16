package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import com.mongodb.client.result.DeleteResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 16:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class DeleteTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 删除操作
     */
    @Test
    public void delete() {
        Query query = new Query(Criteria.where("_id").is("6079341e637cbb69ad961d0a"));
        DeleteResult result = mongoTemplate.remove(query, User.class);
        long count = result.getDeletedCount();

        System.out.println(count);

        User user = mongoTemplate.findById("6079341e637cbb69ad961d0a", User.class);

        System.out.println(user);
    }

}
