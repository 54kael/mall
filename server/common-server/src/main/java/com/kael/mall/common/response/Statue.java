package com.kael.mall.common.response;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
public enum  Statue {
    SUCCESS("200","操作成功"),
    FAILED("500","操作失败"),

    UNAUTHORIZED("401","权限不足"),
    FORBIDDEN("403","禁止访问"),
    NOT_FOUND("404","资源不存在");
    private String code;
    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    Statue(String code,String description) {
        this.code = code;
        this.description = description;
    }
}
