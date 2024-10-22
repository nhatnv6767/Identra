package com.dev.identra.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Something went wrong - UNCATEGORIZED_EXCEPTION"),
    INVALID_KEY(1001, "Something went wrong - UNCATEGORIZED_EXCEPTION"),
    USER_EXISTED(1002, "Username already exists"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    INVALID_PASSWORD(1004, "Password must be at least 8 characters"),
    ;


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
