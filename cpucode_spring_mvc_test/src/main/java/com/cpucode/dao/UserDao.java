package com.cpucode.dao;

import com.cpucode.domain.User;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/2/28
 * @time : 17:51
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface UserDao {
    List<User> findAll();

    Long save(User user);

    void saveUserRoleRel(Long id, Long[] roleIds);

    void delUserRoleRel(Long userId);

    void del(Long userId);
}
