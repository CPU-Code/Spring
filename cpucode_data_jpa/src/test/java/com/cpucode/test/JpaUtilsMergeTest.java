package com.cpucode.test;

import com.cpucode.domain.Customer;
import com.cpucode.utils.JpaUtils;
import org.junit.Test;
import org.omg.CORBA.TRANSACTION_MODE;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 21:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpaUtilsMergeTest {
    @Test
    public void test1(){
        EntityManager entityManager = JpaUtils.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        Customer customer = entityManager.find(Customer.class, 2L);
        customer.setCustName("cpu");
        //把customer对象从缓存中清除出去
        entityManager.clear();
        entityManager.merge(customer);

        //提交事务
        transaction.commit();
        //释放资源
        entityManager.close();
    }
}
