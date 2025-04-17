package book;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long bkIdx;
    private String title;
    private String author;
    private String category;
    private String info;
    private Integer amount;
    @Column(columnDefinition = "timestamp default now()")
    private LocalDateTime createdAt;
    private Integer rentCnt;
    private Boolean activated;
}
