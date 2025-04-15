package com.grepp.spring.app.model.member;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberServiceTest {

    @Test
    public void signup() {
        MemberService memberService = new MemberService();
        memberService.signup("test");
    }
}