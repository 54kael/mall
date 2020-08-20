package com.kael.mall.entity.vo;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
public class LoginParam {

    @NotEmpty(message = "账号为空")
    @ApiModelProperty("登录账号")
    private String account;

    @NotEmpty(message = "密码为空")
    @ApiModelProperty("登录密码")
    private String password;

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
}
