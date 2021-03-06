package com.cpucode.mapper;

import com.cpucode.domain.Order;
import com.cpucode.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/6
 * @time : 13:51
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface OrderMapper {

/*    @Select("select *, o.id oid from orders o, user u where o.uid = u.id")
    @Results(value = {
            @Result(column = "oid", property = "id"),
            @Result(column = "total", property = "total"),
            @Result(column = "uid", property = "user.id"),
            @Result(column = "username", property = "user.username"),
            @Result(column = "password", property = "user.password")
    })
    public List<Order> findAll();*/

    @Select("select * from orders")
    @Results({
        @Result(column = "id" , property = "id"),
        @Result(column = "total", property = "total"),
        @Result(
                property = "user",
                column = "uid",
                javaType = User.class,  //要封装的实体类型
                one = @One(select = "com.cpucode.mapper.UserMapper.findById")   //select属性 代表查询那个接口的方法获得数据
        )
    })
    public List<Order> findAll();
}
