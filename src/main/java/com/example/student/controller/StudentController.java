package com.example.student.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author 胡
 * @Date 2023/2/17 14:51
 * @Version 1.0
 **/
@Slf4j
@Api(tags = "学生管理")
@Controller
@RequestMapping("/student")
public class StudentController {
}
