package com.example.blog.entity;


import com.example.blog.common.BaseDO;
import lombok.Getter;
import lombok.Setter;

/**
 * 好友表(UserFriend)表实体类
 *
 * @author makejava
 * @since 2022-07-14 21:53:55
 */
@Getter
@Setter
public class UserFriend extends BaseDO {
    //ID
    private Long id;
    //用户ID
    private Long userId;
    //好友ID
    private Long friendId;
    //好友备注
    private String note;
    //好友状态
    private String status;
}

