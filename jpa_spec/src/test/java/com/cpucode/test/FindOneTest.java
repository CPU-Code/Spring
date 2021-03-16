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

/**
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 23:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FindOneTest {

    @Autowired
    private CustomerDao customerDao;

    /**
     * 匿名内部类
     *  自定义查询条件
     *      1.实现Specification接口(提供泛型:查询的对象类型)
     *      2.买现toPredicate方法(构造查询条件)
     *      3.需要借助方法参数中的两个参数(
     *          root:获取需要查询的对象属性
     *          CriteriaBuilder:构造查询条件的,内部封装了很多的查询条件(模糊匹配,精准匹配)
     *      案例:根据客户名称查询,查询客户名为传智播客的客户
     *      查询条件
     *          1.查询方式
     *              cb对象
     *          2.比较的属性名称
     *              root对象
     */
    @Test
    public void test1(){
        Specification<Customer> specification = new Specification<Customer>() {
            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //1.获取比较的属性
                Path<Object> custName = root.get("custName");

                //2.构造查询条件:select*from cst_customer where cust_name='传智播客'
                /**
                 * 进行精准的匹配 (比较的属性,比较的属性的取值)
                 *第一个参数:需要比较的属性(path对象)
                 *第二个参数:当前需要比较的取值
                 */
                Predicate predicate = criteriaBuilder.equal(custName, "cpucode");

                return predicate;
            }
        };

        Customer customer = customerDao.findOne(specification);

        System.out.println(customer);
    }

}
