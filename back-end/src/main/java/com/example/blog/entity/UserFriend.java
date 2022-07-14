package com.example.blog.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 好友表(UserFriend)表实体类
 *
 * @author makejava
 * @since 2022-07-14 21:53:55
 */
@Getter
@Setter
public class UserFriend {
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
    //创建时间
    private LocalDateTime createTime;
    //创建人
    private String createBy;
    //更新时间
    private LocalDateTime updateTime;
    //更新人
    private String updateBy;
}

