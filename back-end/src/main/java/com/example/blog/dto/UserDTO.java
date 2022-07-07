package com.example.blog.dto;

import com.example.blog.validator.UserDTOGroupA;
import com.example.blog.validator.UserDTOGroupB;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Setter
@Getter
public class UserDTO {
    @NotBlank(message = "姓名不许为空", groups = {UserDTOGroupA.class})
    private String name;
    @NotNull(message = "年龄不能为空")
    private Integer age;
    private String address;
    @Pattern(regexp = "^(18[0-9])\\d{8}$", message = "手机格式错误", groups = {UserDTOGroupA.class})
    @Pattern(regexp = "^(13[0-9])\\d{8}$", message = "手机格式错误", groups = {UserDTOGroupB.class})
    private String phone;
    @Email(message = "邮箱格式错误")
    private String email;
}
