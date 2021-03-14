package com.cpucode.test;

import com.cpucode.domain.Customer;
import com.cpucode.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * 根据id查询客户
 * 使用find方法查询:
 *      1.查询的对象就是当前客户对象本身
 *      2.在调用find方法的时候,就会发送sq1语句查询数据甪
 *
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 21:09
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpaUtilsFindTest {
    @Test
    public void test1(){
        //1.通过工具类获取entityManager
        EntityManager entityManager = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        //3.增删改查--根据id查询客户
        /**
         *find:根据id查询数据
         *  class:查询数据的结果需要包装的实体类类型的字节码
         *  id:查询的主键的取值
         */
        Customer customer = entityManager.find(Customer.class, 1L);

        System.out.println(customer);

        //4.提交事务
        transaction.commit();
        //5.释放资源
        entityManager.close();



    }
}
