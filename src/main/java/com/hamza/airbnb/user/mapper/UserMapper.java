package com.hamza.airbnb.user.mapper;

import com.hamza.airbnb.user.application.dto.ReadUserDTO;
import com.hamza.airbnb.user.domain.Authority;
import com.hamza.airbnb.user.domain.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    ReadUserDTO readUserToReadUserDTO(User user);
    default String mapAuthoritiesToString(Authority authority){
        return authority.getName();
    }
}
