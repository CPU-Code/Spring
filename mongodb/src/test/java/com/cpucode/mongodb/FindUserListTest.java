package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 16:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class FindUserListTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 条件查询
     */
    @Test
    public void findUserList() {
        Query query = new Query(Criteria
                .where("name").is("test")
                .and("age").is(20));

        List<User> userList = mongoTemplate.find(query, User.class);

        System.out.println(userList);
    }

}
