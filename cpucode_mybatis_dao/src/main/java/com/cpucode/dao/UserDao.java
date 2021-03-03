package com.cpucode.dao;

import com.cpucode.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/3
 * @time : 12:49
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface UserDao {
    public List<User> findAll() throws IOException;

    public User findById(int id);
}
