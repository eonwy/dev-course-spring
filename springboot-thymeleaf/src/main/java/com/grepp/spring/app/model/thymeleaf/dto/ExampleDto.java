package com.grepp.spring.app.model.thymeleaf.dto;

public record ExampleDto(
    String name,
    Integer age,
    String subject,
    Integer score,
    Boolean isStudent
) {

}
