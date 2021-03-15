package com.cpucode.domain;


/**
 *  所有的注解都是使用JPA的规范提供的注解，
 *  所以在导入注解包的时候，一定要导入javax.persistence下的
 *
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 11:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */


import javax.persistence.*;

/**
 * 声明实体类
 */
@Entity
/**
 * 建立实体类和表的映射关系
 */
@Table(name = "cust_customer")
public class Customer {
    /**
     * 客户组件
     */
    /**
     * 声明当前私有属性为主键
     */
    @Id
    /**
     * 配置主键的生成策略
     * @GeneratedValue : 配置主键的生成策略
     * strategy
     *      GenerationType.IDENTITY: 自增, mysql
     *           底层数据库必须支持自动增长(底层数据库支持的自动增长方式,对id自增)
     *      GenerationType.SEQUENCE: 序列, oracle
     *          底层数据库必须支持序列
     *      GenerationType.TABLE:
     *          jpa提供的一种机制,通过一张数据库表的形式帮助我们完成主键自增
     *      GenerationType.AUTO:
     *          由程序自动的帮助我们选择主键生成策略
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 指定和表中cust_id字段的映射关系
     */
    @Column(name = "cust_id")
    private Long custId;

    /**
     * 客户名字
     */
    /**
     * 指定和表中cust_name字段的映射关系
     */
    @Column(name = "cust_name")
    private String custName;

    /**
     * 客户来源
     */
    @Column(name = "cust_source")
    private String custSource;

    /**
     * 客户级别
     */
    @Column(name = "cust_level")
    private String custLevel;

    /**
     * 客户所属行业
     */
    @Column(name = "cust_industry")
    private String custIndustry;

    /**
     * 客户的联系方式
     */
    @Column(name = "cust_phone")
    private String custPhone;

    /**
     * 客户地址
     */
    @Column(name = "cust_address")
    private String custAddress;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custAddress='" + custAddress + '\'' +
                '}';
    }
}