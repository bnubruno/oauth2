package com.github.bnubruno.mappers;

import com.github.bnubruno.dtos.response.UserDTO;
import com.github.bnubruno.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "authorities", target = "authorities")
    UserDTO map(User user);

}
