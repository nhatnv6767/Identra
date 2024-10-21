package com.dev.identra.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;

// Khai bao cho Json biet rang la khi serizlize object nay sang json thi nhung
// cai nao null thi no ko fill vao json
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private int code = 1000;
    private String message;
    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
