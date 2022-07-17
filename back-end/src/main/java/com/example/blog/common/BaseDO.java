package com.example.blog.common;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDO {
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
