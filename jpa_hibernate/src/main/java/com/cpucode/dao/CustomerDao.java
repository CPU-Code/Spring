package com.cpucode.dao;

import com.cpucode.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *  JpaRepository<实体类类型，主键类型>：
 *      用来完成基本CRUD操作
 *  JpaSpecificationExecutor<实体类类型>：
 *      用于复杂查询（分页等查询操作）
 *
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 12:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface CustomerDao extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {

    /**
     * 案例:根据客户名称查询客户
     * 使用jpq1的形式查询
     *      jpql:from Customer where custName=?
     *  配置jpq1语句,使用的@Query注解
     */
    @Query(value = "from Customer where custName = ?")
    public Customer findJpql(String custName);

    /**
     * 案例:根据客户名称和客户id查询客户
     *      jpql:from Customer where custName=? and custId=?
     *  对于多个占位符参数
     *      赋值的时候,默认的情况下,占位符的位置需要和方法参数中的位置保持一致
     *  可以指定占位符参数的位置
     *      ?索引的方式,指定此占位的取值来源
     * @param name
     * @param id
     * @return
     */
    @Query(value = "from Customer where custName = ? and custId = ?")
    public Customer findCustNameAndId(String name, Long id);

    /**
     * 使用jpq1完成更新操作
     *  案例: 根据id更新,客户的名称
     *  更新4号客户的名称,将名称改为“黑马程序员”
     *      sql : update cst_customer set cust_name=?where cust_id=?
     *      jpql : update Customer set custName=?where custId=?
     * @Query : 代表的是进行查询
     *      声明此方法是用来进行更新操作
     * @Modifying
     *      当前执行的是一个更新操作
     */
    @Query(value = "update Customer set custName = ?2 where custId = ?1")
    @Modifying
    public void updateCustomper(Long custId, String custName);

    /**
     * 使用sq1的形式查询:
     *      查询全部的客户
     * sql: select * from cst_customer;
     *
     * Query:配置sq1查询
     *      value:sql语句
     *      nativeQuery:查询方株式
     *          true:sql查询
     *          false:jpq1查询
     */
    @Query(value = "select * from cust_customer", nativeQuery = true)
    public List<Object [] > findSql();

    @Query(value = "select * from cust_customer where cust_name like ?1", nativeQuery = true)
    public List<Object [] > findVague(String name);

    /**
     * 方法名的约定:
     *  findBy:查询
     *      对象中的属性名(首字母大写):查询的条件
     *      CustName
     * findByCustName -- 根据客户名称查询
     *
     * 再springdataJpa的运行阶段
     *      会根据方法名称进行解析 findBy from xxx(实体类)
     *          属性名称    where custName =
     */
    public Customer findByCustName(String custName);

    /**
     * findBy + 属性名称 (根据属性名称进行完成匹配的查询 = )
     *      findBy + 属性名称 + “ 查询方式 ( Like | isnull ) ”
     *          findByCustNameLike
     */
    public List<Customer> findByCustNameLike(String custName);
}
