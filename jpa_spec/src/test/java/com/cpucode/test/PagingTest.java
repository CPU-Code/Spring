package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import com.cpucode.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : cpucode
 * @date : 2021/3/16
 * @time : 20:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PagingTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 分页查询
     * Specification:查询条件
     * Pageable:分页参数
     * 分页参数:查询的页码,每页查询的条数
     * findAll(Specification,Pageable):带有条件的分页
     * findAl1(Pageable):没有条件的分页
     * 返回:Page(springDataJpa为我们封装好的pageBean对象,数据列表,共条数)
     *
     */
    @Test
    public void test1(){
        /**
         *  PageRequest对象是Pageable接口的实现类
         *   创建PageRequest的过程中,需要调用他的构造方法传入两个参数
         *      第一个参数:当前查询的页数(从o开始)
         *      第二个参数:每页查询的数量
         */
        PageRequest pageRequest = new PageRequest(0, 1);

        Page<Customer> all = customerDao.findAll(null, pageRequest);

        System.out.println(all.getContent());
        System.out.println(all.getTotalElements());
        System.out.println(all.getTotalPages());
    }


}
