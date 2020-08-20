package com.kael.mall.controller;

import com.kael.mall.common.response.Result;
import com.kael.mall.entity.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
@Api(tags = "用户模块")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @ApiOperation("用户登录")
    @PostMapping("/login")
    public Result login(@RequestBody @Validated LoginParam loginParam){
        System.out.println(loginParam);
        return Result.ok();
    }

    @ApiOperation("手机注册")
    @PostMapping("/register")
    public Result register(@RequestBody String phone) {
        System.out.println(phone);
        return Result.ok("注册成功");
    }



    @ApiOperation("用户信息完善")
    @PostMapping("/info")
    public Result register(@RequestBody RegisterParam param) {
        System.out.println("成功");
        return Result.ok();
    }

    @ApiOperation("更改用户信息")
    @PutMapping("/info")
    public Result update(@RequestBody @Validated CustomerInfo customerInfo) {
        System.out.println(customerInfo);
        return Result.ok();
    }

    @ApiOperation("获取基本信息")
    @GetMapping("/info/{account}")
    public Result getInfo(@PathVariable("account") String account) {
        System.out.println(account);
        return Result.ok();
    }


    @ApiOperation("重置密码")
    @PostMapping("/password")
    public Result resetPassword(@RequestBody @Validated ResetPasswordParam param){
        System.out.println("密码找回成功");
        return Result.ok("密码找回");
    }

}
