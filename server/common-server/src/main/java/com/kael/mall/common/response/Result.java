package com.kael.mall.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    private String code;
    private String message;
    private Object data;


    /**
     * 操作成功，不需要返回数据
     */
    public static Result ok() {
        Result result = new Result();
        result.setCode(Statue.SUCCESS.getCode());
        result.setMessage(Statue.SUCCESS.getDescription());
        return result;
    }

    /**
     * 操作成功,返回数据
     * @param data 数据
     * @return 返回结果
     */
    public static Result ok(Object data) {
        Result result = new Result();
        result.setCode(Statue.SUCCESS.getCode());
        result.setMessage(Statue.SUCCESS.getDescription());
        result.setData(data);
        return result;
    }

    /**
     * 操作失败
     * @param message 失败信息
     */
    public static Result failure(String message) {
        Result result = new Result();
        result.setCode("500");
        result.setMessage(message);
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
