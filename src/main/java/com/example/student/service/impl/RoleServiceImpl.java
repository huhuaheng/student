package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.entity.Role;
import com.example.student.mapper.RoleMapper;
import com.example.student.service.RoleService;
import org.springframework.stereotype.Service;

/**
* @author 胡
* @description 针对表【role(角色表)】的数据库操作Service实现
* @createDate 2023-02-17 14:36:56
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
implements RoleService {

}
