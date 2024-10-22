package com.dev.identra.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class UserCreationRequest {
    // yêu cầu truyền vào 1 constant - chính là key của ErrorCode (enum)
    @Size(min = 3, message = "USERNAME_INVALID")
    private String username;
    @Size(min = 8, message = "INVALID_PASSWORD")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;

}
