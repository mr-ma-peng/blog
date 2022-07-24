package com.example.blog.converter;

import com.example.blog.dto.UserDTO;
import com.example.blog.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    UserDTO toDTO(User user);
}
