package com.example.student.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CourseController
 * @Description TODO
 * @Author 胡
 * @Date 2023/2/17 14:51
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/course")
public class CourseController {

    @ApiOperation("test swagger-ui ")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "ok";
    }



}
