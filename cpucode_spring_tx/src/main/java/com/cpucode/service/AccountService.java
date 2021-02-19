package com.cpucode.service;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 12:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface AccountService {
    public void transfer(String outMan, String inMan, double money);

    public void errorTest(String outMan, String inMan, double money);
}
