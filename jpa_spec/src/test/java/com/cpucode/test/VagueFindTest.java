package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import com.cpucode.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/16
 * @time : 20:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class VagueFindTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 案例:完成根据客户名称的模糊匹配,返回客户列表
     *      equal:直接的到path对象(属性),然后进行比较即可
     *      gt,lt,ge,le,like:得到path对象,根据path指定比较的参数类型,再去进行比较
     *      指定参数类型:path.as(类型的字节码对象)
     */
    @Test
    public void test1(){
        Specification<Customer> customerSpecification = new Specification<Customer>(){
            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //查询属性:客户名
                Path<Object> custName = root.get("custName");

                //查询方式:模糊匹配
                Predicate like = criteriaBuilder.like(custName.as(String.class), "cpu%");

                return like;
            }
        };

        List<Customer> all = customerDao.findAll(customerSpecification);

        for (Customer customer : all) {
            System.out.println(customer);
        }
    }
}
