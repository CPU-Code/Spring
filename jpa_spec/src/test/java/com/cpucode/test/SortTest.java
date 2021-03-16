package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import com.cpucode.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/16
 * @time : 20:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SortTest {
    @Autowired
    private CustomerDao customerDao;


    @Test
    public void test1(){
        Specification<Customer> specification = new Specification<Customer>() {
            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<Object> custName = root.get("custName");

                Predicate like = criteriaBuilder.like(custName.as(String.class), "cpu%");

                return like;
            }
        };


        /**
         * 添加排序
         * 创建排序对象,需要调用构造方法实例化sort对象
         * 第一个参数:排序的顺序(倒序,正序)
         *      Sort.Direction.DESC:倒序
         *      Sort.Direction.ASC:升序
         * 第二个参数:排序的属性名称
         */
        Sort custId = new Sort(Sort.Direction.DESC, "custId");
        List<Customer> all = customerDao.findAll(specification, custId);

        for (Customer customer : all) {
            System.out.println(customer);
        }
    }
}
