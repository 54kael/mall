package com.kael.mall.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */

public class Customer{
    /** id*/
    private Integer id;

    /** 昵称 */
    private String nikeName;

    /** 账号 */
    private String account;

    /** 密码 */
    private String password;

    /** 余额 */
    private BigDecimal balance;

    /** 性别*/
    private String gender;

    /** 地址 */
    private List<String> address;

    /** 手机 */
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
