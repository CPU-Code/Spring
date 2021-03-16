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
 * @date : 2021/3/16
 * @time : 19:53
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AndTest {

    @Autowired
    private CustomerDao customerDao;

    /**
     * root:获取属性
     *      客户名
     *      所属行业
     * cb:构造查询
     *      1.构造客户名的精准匹配查询
     *      2.构造所属行业的精准匹配查询
     *      3.将以上两个查询联系起来
     */
    @Test
    public void test1(){
        Specification<Customer> customerSpecification = new Specification<Customer>(){

            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<Object> custName = root.get("custName");
                Path<Object> custId = root.get("custId");

                /**
                 * 构造查询
                 * 1.构造客户名的精准匹配查询
                 * 第一个参数,path(属性),第二个参数,属性的取值
                 */
                Predicate cpucode = criteriaBuilder.equal(custName, "cpucode");

                /**
                 * 2.构造所属行业的精准匹配查询
                 */
                Predicate equal = criteriaBuilder.equal(custId, "3");
                /**
                 * 3.将多个查询条件组合到一起:组合(满足条件一并且满足条件二:与关系,满足条件一或满足条件二即可:或关系)
                 * 以与的形式拼接多个查询条件
                 */
                Predicate and = criteriaBuilder.and(cpucode, equal);

                /**
                 * 以或的形式拼接多个查询条件
                 */
                return and;
            }
        };

        Customer one = customerDao.findOne(customerSpecification);

        System.out.println(one);
    }
}
