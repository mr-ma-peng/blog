package com.example.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.dao.ClassificationDao;
import com.example.blog.entity.Classification;
import com.example.blog.service.ClassificationService;
import org.springframework.stereotype.Service;

/**
 * 分类表(Classification)表服务实现类
 *
 * @author makejava
 * @since 2022-07-14 21:48:36
 */
@Service("classificationService")
public class ClassificationServiceImpl extends ServiceImpl<ClassificationDao, Classification> implements ClassificationService {

}

