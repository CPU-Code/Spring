package com.cpucode.dao;

import com.cpucode.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

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
}
