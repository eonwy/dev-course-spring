package com.grepp.spring.app.controller.web.error;

import org.springframework.security.authorization.AuthorizationDeniedException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("error")
public class ErrorController {

    @GetMapping("authorization")
    public String authorizationError(){
        throw new AuthorizationDeniedException("접근 권한이 없습니다.");
    }
}