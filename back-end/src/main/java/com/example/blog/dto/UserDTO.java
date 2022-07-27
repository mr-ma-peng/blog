package com.example.blog.dto;

import com.example.blog.common.Base;
import com.example.blog.validator.UserDTOGroupA;
import com.example.blog.validator.UserDTOGroupB;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Setter
@Getter
public class UserDTO extends Base {
    //ID
    private Long id;
    @NotBlank(message = "姓名不许为空", groups = {UserDTOGroupA.class})
    private String name;
    //昵称
    private String nickname;
    //密码
    private String password;
    //性别
    private Integer sex;
    //头像
    private String photo;
    @NotNull(message = "年龄不能为空")
    private Integer age;
    @Pattern(regexp = "^(18[0-9])\\d{8}$", message = "手机格式错误", groups = {UserDTOGroupA.class})
    @Pattern(regexp = "^(13[0-9])\\d{8}$", message = "手机格式错误", groups = {UserDTOGroupB.class})
    //手机号
    private String telephone;
    @Email(message = "邮箱格式错误")
    private String email;
    //注册时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    private LocalDateTime registrationTime;


}
