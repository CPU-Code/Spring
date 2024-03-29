package com.cpucode.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : cpucode
 * @date : 2021/3/18
 * @time : 9:09
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

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

    /**
     * 配置客户和联系人之间的关系(一对多关系)
     * 使用注解的形式配置多表关系
     *      1.声明关系
     *          @OneToMany : 配置一对多关系
     *              targetEntity:对方对象的字节码对象
     *      2.配置外键(中间表)
     *          @JoinColumn : 配置外键
     *              name: 外键字段名称
     *              referencedColumnName: 参照的主表的主键字段名称
     *   在客户实体类上(一的一方)添加了外键了配置所以对于客户而言,也具备了维护外键的作用
     */
    @OneToMany(targetEntity = LinkMan.class)
    @JoinColumn(name = "lkm_cust_id", referencedColumnName = "cust_id")
    private Set<LinkMan> linkmans = new HashSet<>();

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

    public Set<LinkMan> getLinkmans() {
        return linkmans;
    }

    public void setLinkmans(Set<LinkMan> linkmans) {
        this.linkmans = linkmans;
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
                ", linkmans=" + linkmans +
                '}';
    }

}