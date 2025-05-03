package com.spring.store.mappers;

import com.spring.store.dto.RegisterUserRequest;
import com.spring.store.dto.UpdateUserRequest;
import org.mapstruct.Mapper;
import com.spring.store.entities.User;
import com.spring.store.dto.UserDto;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    UserDto toDto(User user);

    User toEntity(RegisterUserRequest request);

    void update(UpdateUserRequest request, @MappingTarget User user);
}
