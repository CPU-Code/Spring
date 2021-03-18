package com.cpucode.dao;

import com.cpucode.domain.LinkMan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author : cpucode
 * @date : 2021/3/18
 * @time : 9:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface LinkManDao extends JpaRepository<LinkMan, Long>,JpaSpecificationExecutor<LinkMan> {
}
