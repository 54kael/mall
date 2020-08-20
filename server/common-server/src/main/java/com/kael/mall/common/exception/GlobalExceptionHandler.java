package com.kael.mall.common.exception;

import com.kael.mall.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 拦截自定义异常
     * @param e 自定义异常
     */
    @ExceptionHandler(value = MallException.class)
    public Result hrHandle(MallException e) {
        e.printStackTrace();
        log.error("{}",e.getMessage());
        return Result.failure(e.getMessage());
    }


    /**
     * 参数校验失败异常处理器
     * @param e 参数校验异常类
     * @return 校验失败的字段和信息，并设置http状态码
     */
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        e.printStackTrace();
        String errorMessage = null;
        FieldError fieldError = e.getBindingResult().getFieldError();
        if (fieldError!=null) {
            errorMessage = fieldError.getDefaultMessage();
            log.error("{}",errorMessage);
        }
        return Result.failure(errorMessage);
    }


    /**
     * 无效参数异常处理器
     * @param e 异常
     * @return 结果
     */
    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Result messageNotReadableHandle(HttpMessageNotReadableException e) {
        log.error("{}",e.getMessage());
        e.printStackTrace();
        return Result.failure("无效参数");
    }


    /**
     * 其他异常处理器
     * @param e 异常
     * @return 信息
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE)
    public Result otherHandle(Exception e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return Result.failure("未知异常");
    }
}
