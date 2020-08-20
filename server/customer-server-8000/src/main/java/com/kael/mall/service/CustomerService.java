package com.kael.mall.service;

import com.kael.mall.entity.Customer;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
public interface CustomerService {
    /**
     * 登录
     * @param account 账号
     * @param password 密码
     * @return 用户
     */
    Customer login(String account,String password);

    /**
     * 注册
     * @param customer 用户信息
     */
    void register(Customer customer);
}
