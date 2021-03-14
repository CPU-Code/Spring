package com.cpucode.test;

import com.cpucode.domain.Customer;
import com.cpucode.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * 根据id查询客户
 * getReference方法
 *
 * 1.获取的对象是一个动态代理对象
 * 2.调用getReference方法不会立即发送sq1语句查询数据库
 *      当调用查询结果对象的时候,才会发送查询的sq1语句:什么时候用,什么时候发送sql语句查询数据库
 *
 *  延迟加载(懒加载)
 *    得到的是一个动态代理对象
 *    什么时候用,什么使用才会查询
 *
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 21:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpaUtilsReferenceTest {
    @Test
    public void test1(){

        //1.通过工具类获取entityManager
        EntityManager entityManager = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        //3.增删改查--根据id查询客户
        /**
         *getReference:根据id查询数据
         *      class:查询数据的结果需要包装的实体类类型的字节码
         *      id:查询的主键的取值
         */
        Customer reference = entityManager.getReference(Customer.class, 1L);
        System.out.println(reference);

        //4.提交事务
        transaction.commit();
        //5.释放资源
        entityManager.close();
    }
}
