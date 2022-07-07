package com.example.blog.controller;

import com.example.blog.dto.UserDTO;
import com.example.blog.validator.UserDTOGroupA;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.groups.Default;

@RestController
@RequestMapping("user")
public class UserController {

    @PostMapping("owner")
    public String userParamsValidate(@RequestBody @Validated({UserDTOGroupA.class, Default.class}) UserDTO userDTO) {
        return userDTO.toString();
    }
}
