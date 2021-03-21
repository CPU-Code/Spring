package com.cpucode.user.service;

import com.cpucode.user.mapper.UserMapper;
import com.cpucode.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : cpucode
 * @date : 2021/3/21
 * @time : 18:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 根据主键查询用户
     *
     * Qretunn
     * @param id 用户id
     * @return 用户
     */
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
