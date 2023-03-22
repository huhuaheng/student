package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.entity.Clazz;
import com.example.student.mapper.ClazzMapper;
import com.example.student.service.ClazzService;
import org.springframework.stereotype.Service;

/**
* @author 胡
* @description 针对表【class(班级表)】的数据库操作Service实现
* @createDate 2023-02-17 14:36:56
*/
@Service
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz> implements ClazzService {

}
