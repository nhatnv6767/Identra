package com.dev.identra.configuration;

import com.dev.identra.dto.request.ApiResponse;
import com.dev.identra.exception.ErrorCode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import java.io.IOException;

/*
vì authenticationEntryPoint cần implement lại từ 1 interface AuthenticationEntryPoint
* */
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        // xảy ra trong quá trình authenticate : failure
        ErrorCode errorCode = ErrorCode.UNAUTHENTICATED;
        response.setStatus(errorCode.getStatusCode().value());
        // de tra ve body voi content-type la json
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        // response body
        ApiResponse<?> apiResponse = ApiResponse.builder()
                .code(errorCode.getCode())
                .message(errorCode.getMessage())
                .build();
        // sau khi build xong object cua ApiResponse -> viet vao response de commit len user
        ObjectMapper objectMapper = new ObjectMapper();
        // vi trong write yeu cau 1 string ma cua chung ta hien tai dang la 1 object -> convert object to JSON
        response.getWriter().write(objectMapper.writeValueAsString(apiResponse));
    }
}
