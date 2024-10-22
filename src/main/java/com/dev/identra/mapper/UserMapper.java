package com.dev.identra.mapper;

import com.dev.identra.dto.request.UserCreationRequest;
import com.dev.identra.dto.request.UserUpdateRequest;
import com.dev.identra.dto.response.UserResponse;
import com.dev.identra.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

// Mapper để map dữ liệu từ UserCreationRequest về Object User
// baáo cho mapstruct biết là ta sẽ gen cái mapper này để sử dụng trong Spring (dependencies injection)
@Mapper(componentModel = "spring")
public interface UserMapper {
    // nhận về 1 cái parameter là request theo kiểu là UserCreationRequest và nó sẽ trả về 1 class là User
    User toUser(UserCreationRequest request);

    // khi property khac nhau
    @Mapping(source = "firstName", target = "lastName")
    UserResponse toUserResponse(User user);

    // map data từ UserUpdateRequest vào Object User
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
