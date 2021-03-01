package com.cpucode.service;

import com.cpucode.domain.User;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/2/28
 * @time : 17:52
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface UserService {
    List<User> list();

    void save(User user, Long[] roleIds);

    void del(Long userId);
}
