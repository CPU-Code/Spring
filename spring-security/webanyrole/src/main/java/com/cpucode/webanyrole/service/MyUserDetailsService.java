package com.cpucode.webanyrole.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cpucode.webanyrole.entity.Users;
import com.cpucode.webanyrole.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/7/3
 * @time : 21:20
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<Users> wrapper = new QueryWrapper<Users>();

        wrapper.eq("username" , username);
        Users users = usersMapper.selectOne(wrapper);

        if (users == null){
            throw new UsernameNotFoundException("用户名不存在！ ");
        }

        System.out.println(users);

        // 在UserDetailsService,把返回User对象设置杈限
        List<GrantedAuthority> auths =
                AuthorityUtils.commaSeparatedStringToAuthorityList("manager, ROLE_admin");

        return new User(users.getUsername(), new BCryptPasswordEncoder().encode(users.getPassword()), auths);
    }
}
