package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.entity.TeacherCourse;
import com.example.student.mapper.TeacherCourseMapper;
import com.example.student.service.TeacherCourseService;
import org.springframework.stereotype.Service;

/**
* @author 胡
* @description 针对表【teacher_course(讲师课程关系表)】的数据库操作Service实现
* @createDate 2023-02-17 14:36:56
*/
@Service
public class TeacherCourseServiceImpl extends ServiceImpl<TeacherCourseMapper, TeacherCourse> implements TeacherCourseService {

}
