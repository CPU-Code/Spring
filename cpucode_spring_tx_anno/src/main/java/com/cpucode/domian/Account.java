package com.cpucode.domian;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 14:43
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Account {
    private String name;
    private String money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
