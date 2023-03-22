package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.Course;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 胡
* @description 针对表【course(课程管理)】的数据库操作Mapper
* @createDate 2023-02-17 14:43:00
* @Entity com.example.student.entity.Course
*/
@Mapper
public interface CourseMapper extends BaseMapper<Course> {

    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

}
