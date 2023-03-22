package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.entity.Course;
import com.example.student.mapper.CourseMapper;
import com.example.student.service.CourseService;
import org.springframework.stereotype.Service;

/**
* @author 胡
* @description 针对表【course(课程管理)】的数据库操作Service实现
* @createDate 2023-02-17 14:36:56
*/
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

}
