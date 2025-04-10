package com.grepp.spring.infra.response;

import org.springframework.http.HttpStatus;

public enum ResponseCode {

    OK("0000", HttpStatus.OK, "정상"),
    BAD_REQUEST("4000", HttpStatus.BAD_REQUEST, "비정상"),
    UNAUTHORIZED("2000", HttpStatus.UNAUTHORIZED, "권한 없음");

    private final String code;
    private final HttpStatus status;
    private final String message;

    ResponseCode(String code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public String code() {
        return code;
    }

    public HttpStatus status() {
        return status;
    }

    public String message() {
        return message;
    }
}
