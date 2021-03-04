package com.cpucode.mapper;

import com.cpucode.domain.User;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/3
 * @time : 21:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface UserMapper {
    public int save(User user);

    public User findById(int id);

    public List<User> findAll();
}
