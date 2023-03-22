package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.entity.UserRole;
import com.example.student.mapper.UserRoleMapper;
import com.example.student.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
* @author 胡
* @description 针对表【user_role(用户关联角色表)】的数据库操作Service实现
* @createDate 2023-02-17 14:36:56
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
