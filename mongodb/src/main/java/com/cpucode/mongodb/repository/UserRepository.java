package com.cpucode.mongodb.repository;

import com.cpucode.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 17:33
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
