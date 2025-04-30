package com.spring.store.mappers;

import org.mapstruct.Mapper;
import com.spring.store.entities.User;
import com.spring.store.dto.UserDto;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    UserDto toDto(User user);
}
