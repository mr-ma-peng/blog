package com.example.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.mapper.TagMapper;
import com.example.blog.entity.Tag;
import com.example.blog.service.TagService;
import org.springframework.stereotype.Service;

/**
 * 标签表(Tag)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 21:56:33
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}

