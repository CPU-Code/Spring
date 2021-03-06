package com.cpucode.service;

import com.cpucode.domain.Account;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/6
 * @time : 17:33
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

public interface AccountService {
    /**
     * 保存账户数据
     */
    void save(Account account);

    /**
     * 查询账户数据
     */
    List<Account> findAll();
}
