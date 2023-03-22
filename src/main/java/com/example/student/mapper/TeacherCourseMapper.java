package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.TeacherCourse;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 胡
* @description 针对表【teacher_course(讲师课程关系表)】的数据库操作Mapper
* @createDate 2023-02-17 14:43:01
* @Entity com.example.student.entity.TeacherCourse
*/
@Mapper
public interface TeacherCourseMapper extends BaseMapper<TeacherCourse> {

    int deleteByPrimaryKey(Long id);

    int insert(TeacherCourse record);

    int insertSelective(TeacherCourse record);

    TeacherCourse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TeacherCourse record);

    int updateByPrimaryKey(TeacherCourse record);

}
