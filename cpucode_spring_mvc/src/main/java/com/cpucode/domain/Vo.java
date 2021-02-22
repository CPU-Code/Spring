package com.cpucode.domain;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 14:37
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Vo {
    private List<User> userList;

    public List<User> getUserList(){
        return userList;
    }

    public void setUserList(List<User> userList){
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Vo{" +
                "userList=" + userList +
                '}';
    }
}
