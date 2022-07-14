package com.example.blog.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 用户表(User)表实体类
 *
 * @author makejava
 * @since 2022-07-14 21:52:56
 */
@Getter
@Setter
public class User {
    //ID
    private Long id;
    //用户名
    private String name;
    //密码
    private String password;
    //性别
    private Integer sex;
    //头像
    private String photo;
    //年龄
    private Integer age;
    //手机号
    private String telephone;
    //邮箱
    private String email;
    //昵称
    private String nickname;
    //注册时间
    private LocalDateTime registrationTime;
    //创建时间
    private LocalDateTime createTime;
    //创建人
    private String createBy;
    //更新时间
    private LocalDateTime updateTime;
    //更新人
    private String updateBy;
}

