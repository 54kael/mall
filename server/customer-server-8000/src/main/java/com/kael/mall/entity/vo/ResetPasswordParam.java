package com.kael.mall.entity.vo;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
public class ResetPasswordParam {
    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("旧密码")
    private String oldPassword;

    @NotEmpty(message = "新密码为空")
    @ApiModelProperty("新密码")
    private String newPassword1;

    @NotEmpty(message = "确认密码")
    @ApiModelProperty("确认密码")
    private String newPassword2;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword1() {
        return newPassword1;
    }

    public void setNewPassword1(String newPassword1) {
        this.newPassword1 = newPassword1;
    }

    public String getNewPassword2() {
        return newPassword2;
    }

    public void setNewPassword2(String newPassword2) {
        this.newPassword2 = newPassword2;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
