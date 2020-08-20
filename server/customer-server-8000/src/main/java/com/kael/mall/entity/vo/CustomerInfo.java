package com.kael.mall.entity.vo;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
public class CustomerInfo {
    @ApiModelProperty
    @NotEmpty(message = "id为空")
    private Integer id;

    @ApiModelProperty("性别")
    @NotEmpty(message = "性别为空")
    private String gender;

    @ApiModelProperty("昵称")
    @NotEmpty(message = "昵称为空")
    private String nikeName;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }
}
