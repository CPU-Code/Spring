package com.cpucode.mapper;

import com.cpucode.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/5
 * @time : 15:19
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface UserMapper {

    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user where id = #{id}")
    public User findById(int id);

    @Insert("insert into user(id, username, password) values(#{id}, #{username}, #{password})")
    public int save(User user);

    @Update("update user set username = #{username} , password = #{password} where id = #{id}")
    public int update(User user);

    @Delete("delete from user where id = #{id}")
    public int delete(int id);




}
