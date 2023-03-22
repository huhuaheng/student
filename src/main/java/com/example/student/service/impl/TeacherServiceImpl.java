package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.entity.Teacher;
import com.example.student.mapper.TeacherMapper;
import com.example.student.service.TeacherService;
import org.springframework.stereotype.Service;

/**
* @author 胡
* @description 针对表【teacher(教师管理)】的数据库操作Service实现
* @createDate 2023-02-17 14:36:56
*/
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher>
implements TeacherService {

}
