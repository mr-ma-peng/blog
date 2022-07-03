package com.example.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping
    public String hello() {
        return "Hello world";
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String getData() {
        return "RequestMethod GET";
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    public String postData() {
        return "RequestMethod POST";
    }
}
