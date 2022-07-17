package com.example.blog.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 标签表(Tag)表实体类
 *
 * @author Peng Ma
 * @since 2022-07-17 21:56:33
 */
@Getter
@Setter
public class Tag{
    //ID
    private Long id;
    //标签名称
    private String name;
    //描述
    private String description;
    //创建时间
    private LocalDateTime createTime;
    //创建人
    private String createBy;
    //创建时间
    private LocalDateTime updateTime;
    //更新人
    private String updateBy;
}

