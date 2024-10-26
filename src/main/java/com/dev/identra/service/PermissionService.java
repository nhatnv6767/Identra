package com.dev.identra.service;

import com.dev.identra.dto.request.PermissionRequest;
import com.dev.identra.dto.response.PermissionResponse;
import com.dev.identra.entity.Permission;
import com.dev.identra.repository.PermissionRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PermissionService {
    PermissionRepository permissionRepository;

    PermissionResponse create(PermissionRequest request) {
        Permission permission;
    }
}
