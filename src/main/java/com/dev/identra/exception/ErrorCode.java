package com.dev.identra.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Something went wrong - UNCATEGORIZED_EXCEPTION"),
    USER_EXISTED(1002, "Username already exists");


    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
