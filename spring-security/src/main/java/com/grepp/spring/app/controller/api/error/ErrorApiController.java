package com.grepp.spring.app.controller.api.error;

import org.springframework.security.authorization.AuthorizationDeniedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/error")
public class ErrorApiController {

    @GetMapping("authorization")
    public String authorizationError(){
        throw new AuthorizationDeniedException("접근 권한이 없습니다.");
    }
}