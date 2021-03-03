package com.cpucode.mapper;

import com.cpucode.domain.User;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/3
 * @time : 15:03
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface UserMapper {

    public List<User> findAll(User user);

    public List<User> findByCondition(User user);

    public List<User> findById(List<Integer> ids);
}
