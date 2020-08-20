package com.kael.mall.common.exception;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
public class MallException extends Exception{
    private final String message;

    public MallException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
