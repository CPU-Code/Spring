package com.cpucode.service.impl;

import com.cpucode.dao.RoleDao;
import com.cpucode.dao.UserDao;
import com.cpucode.domain.Role;
import com.cpucode.domain.User;
import com.cpucode.service.UserService;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/2/28
 * @time : 17:53
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private RoleDao roleDao;
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<User> list() {
        List<User> userList = userDao.findAll();
        //封装userList中的每一个User的roles数据
        for (User user : userList) {
            //获得user的id
            Long id = user.getId();
            //将id作为参数 查询当前userId对应的Role集合数据
            List<Role> roles = roleDao.findRoleByUserId(id);
            user.setRoles(roles);
        }
        return userList;
    }

    @Override
    public void save(User user, Long[] roleIds) {
        //第一步 向sys_user表中存储数据
        Long userId = userDao.save(user);
        //第二步 向sys_user_role 关系表中存储多条数据
        userDao.saveUserRoleRel(userId,roleIds);
    }

    @Override
    public void del(Long userId) {
        //1、删除sys_user_role关系表
        userDao.delUserRoleRel(userId);
        //2、删除sys_user表
        userDao.del(userId);
    }
}
