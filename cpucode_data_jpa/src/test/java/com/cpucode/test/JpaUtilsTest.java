package com.cpucode.test;

import com.cpucode.domain.Customer;
import com.cpucode.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


/**
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 20:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpaUtilsTest {
    @Test
    public void test1(){
        //创建实体管理类
        EntityManager en = JpaUtils.getEntityManager();

        //获取事务对象
        EntityTransaction tx = en.getTransaction();

        //开启事务
        tx.begin();

        Customer customer = new Customer();
        customer.setCustName("cpucode");
        customer.setCustIndustry("blog.csdn.net/qq_44226094");

        //保存操作
        en.persist(customer);
        //提交事务
        tx.commit();
        //释放资源
        en.close();

    }
}
