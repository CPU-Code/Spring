package com.cpucode.test;

import com.cpucode.domain.Customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 15:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpaTest {
    @Test
    public void test1(){
        /**
         * 创建实体管理类工厂，借助Persistence的静态方法获取
         * 		其中传递的参数为持久化单元名称，需要jpa配置文件中指定
         */
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");

        //创建实体管理类
        EntityManager entityManager = factory.createEntityManager();
        //获取事务对象
        EntityTransaction transaction = entityManager.getTransaction();
        //开启事务
        transaction.begin();
        Customer customer = new Customer();
        customer.setCustName("cpucode");
        customer.setCustAddress("github.com/CPU-Code");

        //保存操作
        entityManager.persist(customer);
        //提交事务
        transaction.commit();

        //释放资源
        entityManager.close();
        factory.close();
    }
}
