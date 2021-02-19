package com.cpucode.dao;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 14:43
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface AccountDao {
    public void out(String outMan, double money);
    public void in(String inMan, double money);
}
