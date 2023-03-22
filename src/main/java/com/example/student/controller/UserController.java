package com.example.student.controller;

import com.example.student.common.ResultBean;
import com.example.student.entity.User;
import com.example.student.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author 胡
 * @Date 2023/2/17 14:51
 * @Version 1.0
 **/
@Slf4j
@Api(tags = "用户管理")
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    @ApiOperation("登录")
    public ResultBean login(String username,String password){
        // 用户名和密码校验逻辑
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            subject.login(token);
            return ResultBean.success("登录成功");
        } catch (AuthenticationException e) {
            return ResultBean.error(500,"登录失败");
        }
    }



}
