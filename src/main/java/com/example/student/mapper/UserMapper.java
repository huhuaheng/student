package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 胡
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2023-02-17 14:43:01
* @Entity com.example.student.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
