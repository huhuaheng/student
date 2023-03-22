package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.Clazz;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 胡
* @description 针对表【class(班级表)】的数据库操作Mapper
* @createDate 2023-02-17 14:43:00
* @Entity com.example.student.entity.Clazz
*/
@Mapper
public interface ClazzMapper extends BaseMapper<Clazz> {

    int deleteByPrimaryKey(Long id);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);

}
