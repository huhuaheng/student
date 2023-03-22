package com.example.student.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.entity.User;
import com.example.student.mapper.UserMapper;
import com.example.student.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 胡
 * @description 针对表【user(用户表)】的数据库操作Service实现
 * @createDate 2023-02-17 14:36:56
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public User login(String username, String password) {
        User user = baseMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getUsername, username));
        if(user == null){
            log.info("用户未找到：{}",username);
            throw new RuntimeException("用户名or密码错误");
        }




        return null;
    }
}
