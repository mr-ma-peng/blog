package com.example.blog.entity;


import com.example.blog.common.Base;
import lombok.Getter;
import lombok.Setter;

/**
 * 文章表(Article)表实体类
 *
 * @author makejava
 * @since 2022-07-11 23:11:44
 */
@Getter
@Setter
public class Article extends Base {
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
}

