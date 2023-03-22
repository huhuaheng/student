package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 胡
* @description 针对表【role(角色表)】的数据库操作Mapper
* @createDate 2023-02-17 14:43:01
* @Entity com.example.student.entity.Role
*/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
