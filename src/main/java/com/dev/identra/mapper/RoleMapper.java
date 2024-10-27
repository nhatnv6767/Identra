package com.dev.identra.mapper;

import com.dev.identra.dto.request.PermissionRequest;
import com.dev.identra.dto.response.PermissionResponse;
import com.dev.identra.dto.response.RoleResponse;
import com.dev.identra.entity.Permission;
import com.dev.identra.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

// Mapper để map dữ liệu từ UserCreationRequest về Object User
// baáo cho mapstruct biết là ta sẽ gen cái mapper này để sử dụng trong Spring (dependencies injection)
@Mapper(componentModel = "spring")
public interface RoleMapper {
    // nhận về 1 cái parameter là request theo kiểu là UserCreationRequest và nó sẽ trả về 1 class là User
    // khi map se ignore cai entry permissions
    @Mapping(target = "permissions", ignore = true)
    Role toRole(Role request);

    // khi property khac nhau
//    @Mapping(target = "lastName", ignore = true)
    RoleResponse toRoleResponse(Role role);

}
