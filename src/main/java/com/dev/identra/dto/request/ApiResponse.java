package com.dev.identra.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
// Khai bao cho Json biet rang la khi serizlize object nay sang json thi nhung
// cai nao null thi no ko fill vao json
public class ApiResponse<T> {
    @Builder.Default
    int code = 1000;
    String message;
    T result;

}
