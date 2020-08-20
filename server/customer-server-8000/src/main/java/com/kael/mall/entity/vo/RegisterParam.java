package com.kael.mall.entity.vo;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/21 0021
 */
public class RegisterParam extends CustomerInfo{
    @NotEmpty(message = "账号为空")
    @ApiModelProperty("账号")
    private String account;

    @NotEmpty(message = "密码为空")
    @ApiModelProperty("密码")
    private String password1;

    @NotEmpty(message = "确认密码为空")
    @ApiModelProperty("确认密码")
    private String password2;

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
