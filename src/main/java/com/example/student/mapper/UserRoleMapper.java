package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 胡
* @description 针对表【user_role(用户关联角色表)】的数据库操作Mapper
* @createDate 2023-02-17 14:43:01
* @Entity com.example.student.entity.UserRole
*/
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

}
