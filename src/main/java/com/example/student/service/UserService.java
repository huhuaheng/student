package com.example.student.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.student.entity.User;

/**
* @author 胡
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-02-17 14:36:56
*/
public interface UserService extends IService<User> {


    User login(String username, String password);

}
