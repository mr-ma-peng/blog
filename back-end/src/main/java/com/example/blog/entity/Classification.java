package com.example.blog.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 分类表(Classification)表实体类
 *
 * @author makejava
 * @since 2022-07-14 21:48:36
 */
@Getter
@Setter
public class Classification {
    //ID
    private Long id;
    //父分类ID
    private Long parentId;
    //分类描述
    private String description;
    //分类名称
    private String name;
    //创建时间
    private LocalDateTime createTime;
    //创建人
    private String createBy;
    //更新时间
    private LocalDateTime updateTime;
    //更新人
    private String updateBy;
}

