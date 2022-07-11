package com.example.blog.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 文章表(Article)表实体类
 *
 * @author makejava
 * @since 2022-07-11 23:11:44
 */
@SuppressWarnings("serial")
@Getter
@Setter
public class Article{
    //ID
    private Long id;
    //用户ID
    private Long userId;
    //标题
    private String title;
    //内容
    private String content;
    //点赞数
    private Integer likeCount;
    //浏览量
    private Integer viewCount;
    //收藏次数
    private Integer collectionCount;
    //创建时间
    private LocalDateTime createTime;
    //创建人
    private String createBy;
    //更新时间
    private LocalDateTime updateTime;
    //更新人
    private String updateBy;
    }

