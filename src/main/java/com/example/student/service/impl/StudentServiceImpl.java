package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.entity.Student;
import com.example.student.mapper.StudentMapper;
import com.example.student.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author 胡
 * @description 针对表【student(学生表)】的数据库操作Service实现
 * @createDate 2023-02-17 14:36:56
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
