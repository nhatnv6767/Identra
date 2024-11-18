package com.dev.identra.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

import com.dev.identra.validator.DobConstraint;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    @Size(min = 8, message = "Password must be at least 8 characters")
    String password;
    String firstName;
    String lastName;
    @DobConstraint(min = 15, message = "INVALID_DOB")
    LocalDate dob;
    List<String> roles;

}
