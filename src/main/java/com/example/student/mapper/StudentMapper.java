package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 胡
* @description 针对表【student(学生表)】的数据库操作Mapper
* @createDate 2023-02-17 14:43:01
* @Entity com.example.student.entity.Student
*/
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}
