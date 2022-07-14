package com.example.blog.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 评论表(Comment)表实体类
 *
 * @author makejava
 * @since 2022-07-14 21:49:01
 */
@Getter
@Setter
public class Comment {
    //ID
    private Long id;
    //父评论ID
    private Long parentId;
    //文章ID
    private Long articleId;
    //用户ID（评论人）
    private Long userId;
    //评论内容
    private String content;
    //点赞数
    private Integer likeCount;
    //创建时间
    private LocalDateTime createTime;
    //创建人
    private String createBy;
    //更新时间
    private LocalDateTime updateTime;
    //更新人
    private String updateBy;
}

