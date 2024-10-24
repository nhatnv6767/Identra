package com.dev.identra.controller;

import com.dev.identra.dto.request.ApiResponse;
import com.dev.identra.dto.request.AuthenticationRequest;
import com.dev.identra.dto.request.IntrospectRequest;
import com.dev.identra.dto.response.AuthenticationResponse;
import com.dev.identra.dto.response.IntrospectResponse;
import com.dev.identra.entity.User;
import com.dev.identra.service.AuthenticationService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
// Autowired cac bean
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthenticationController {
    AuthenticationService authenticationService;
    ;

    @PostMapping("/log-in")
    ApiResponse<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
        var result = authenticationService.authenticate(request);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(result)

                .build();
    }

    @PostMapping("/introspect")
    ApiResponse<IntrospectResponse> authenticate(@RequestBody IntrospectRequest request) {
        var result = authenticationService.authenticate(request);
        return ApiResponse.<IntrospectResponse>builder()
                .result(result)

                .build();
    }
}
