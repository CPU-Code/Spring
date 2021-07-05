package com.cpucode.webcookie.controller;

import com.cpucode.webcookie.entity.Users;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/7/3
 * @time : 21:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "hello security";
    }

    /**
     * @PreAuthorize： 注解适合进入方法前的权限验证
     * @return
     */
    //@PreAuthorize("hasAnyAuthority('menu:system')")
    @PreAuthorize("hasRole('ROLE_admin')")
    @GetMapping("index")
    public String index() {
        return "hello index";
    }

    /**
     * @PostAuthorize 在方法执行后再进行权限验证，适合验证带有返回值的权限
     * @return
     */
    @PostAuthorize("hasAnyAuthority('menu:system')")
    @GetMapping("preAuthorize")
    public String preAuthorize(){
        System.out.println("test--PostAuthorize");
        return "PostAuthorize";
    }

    /**
     * 判断是否具有角色，另外需要注意的是这里匹配的字符串需要添加前缀“ROLE_“
     * @return
     */
    @GetMapping("update")
    @Secured({"ROLE_sale","ROLE_manager"})
    public String update() {
        System.out.println("update......");
        return "hello update";
    }

    /**
     * @PostFilter ：权限验证之后对数据进行过滤 留下用户名是 admin1 的数据
     *  表达式中的 filterObject 引用的是方法返回值 List 中的某一个元素
     * @return
     */
    @GetMapping("getAllUser")
    @PreAuthorize("hasRole('ROLE_xx')")
    @PostFilter("filterObject.username == 'admin1'")
    public List<Users> getAllUser(){
        ArrayList<Users> list = new ArrayList<>();

        list.add(new Users(1, "admin1", "6666"));
        list.add(new Users(2, "admin2", "888"));

        return list;
    }


    /**
     * @PreFilter: 进入控制器之前对数据进行过滤
     * @return
     */
    @GetMapping("getTestPreFilter")
    @PreAuthorize("hasRole('ROLE_xx')")
    @PreFilter(value = "filterObject.id%2 == 0")
    public Integer getTestPreFilter(Integer id){

        return id;
    }
}
