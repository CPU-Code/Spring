package com.cpucode.dao;

import com.cpucode.domain.Role;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/1
 * @time : 17:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface RoleDao {
    List<Role> findAll();

    void save(Role role);

    List<Role> findRoleByUserId(Long id);
}
