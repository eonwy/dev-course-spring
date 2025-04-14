package com.grepp.spring.app.model.book.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class BookImg {

    private Integer biIdx;
    private String originalFileName;
    private String renameFileName;
    private String savePath;
    private LocalDateTime createdAt;
    private Boolean activated;

}
