package com.cpucode.mapper;

import com.cpucode.domain.Order;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/4
 * @time : 15:58
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface OrderMapper {
    /**
     * 查询全部的方法
     * */
    public List<Order> findAll();
}
