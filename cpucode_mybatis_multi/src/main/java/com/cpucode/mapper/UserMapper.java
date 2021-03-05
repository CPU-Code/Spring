package com.cpucode.mapper;

import com.cpucode.domain.User;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/4
 * @time : 15:47
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface UserMapper {
    List<User> findAll();
}
