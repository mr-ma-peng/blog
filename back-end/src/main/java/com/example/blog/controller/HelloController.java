package com.example.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Hello")
@RestController
@RequestMapping("hello")
public class HelloController {

    @ApiOperation(value = "hello world", notes = "返回字符串")
    @RequestMapping
    public String hello() {
        return "Hello world";
    }

    @ApiOperation(value = "测试Get接口")
    @GetMapping("get")
    public String getData() {
        return "RequestMethod GET";
    }

    @ApiOperation(value = "测试Post接口")
    @PostMapping("post")
    public String postData() {
        return "RequestMethod POST";
    }
}
