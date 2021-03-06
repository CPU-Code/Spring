package com.cpucode.mapper;

import com.cpucode.domain.Role;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/6
 * @time : 15:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface RoleMapper {

    @Select("select * from role r, user_role ur where ur.roleid = r.id and ur.userid = #{uid}")
    List<Role> findByUid(int uid);
}
