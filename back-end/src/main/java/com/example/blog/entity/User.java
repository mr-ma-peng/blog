package com.example.blog.entity;


import com.example.blog.common.BaseDO;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户表(User)表实体类
 *
 * @author makejava
 * @since 2022-07-14 21:52:56
 */
@Getter
@Setter
public class User extends BaseDO {
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
}

