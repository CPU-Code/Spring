package com.cpucode.service.impl;

import com.cpucode.dao.RoleDao;
import com.cpucode.domain.Role;
import com.cpucode.service.RoleService;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/1
 * @time : 16:41
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> list() {
        List<Role> roleList = roleDao.findAll();
        return roleList;
    }

    @Override
    public void save(Role role) {
        roleDao.save(role);
    }
}
