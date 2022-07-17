package com.example.blog.entity;


import com.example.blog.common.BaseDO;
import lombok.Getter;
import lombok.Setter;

/**
 * 评论表(Comment)表实体类
 *
 * @author makejava
 * @since 2022-07-14 21:49:01
 */
@Getter
@Setter
public class Comment extends BaseDO {
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
}

