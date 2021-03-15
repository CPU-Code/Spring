package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import com.cpucode.domain.Customer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**

 *
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 13:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UpdateTest {

    @Autowired
    private CustomerDao customerDao;

    /**
     *  修改客户：调用save(obj)方法
     *  对于save方法的解释：如果执行此方法是对象中存在id属性，即为更新操作会先根据id查询，再更新
     *     如果执行此方法中对象中不存在id属性，即为保存操作
     */
    @Test
    public void test1(){
        Customer customer = customerDao.findOne(2L);

        customer.setCustName("cpu");

        //更新
        customerDao.save(customer);
    }
}
