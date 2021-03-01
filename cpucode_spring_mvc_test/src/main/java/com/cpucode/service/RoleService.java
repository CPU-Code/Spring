package com.cpucode.service;

import com.cpucode.domain.Role;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/1
 * @time : 16:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface RoleService {
    public List<Role> list();

    void save(Role role);
}
