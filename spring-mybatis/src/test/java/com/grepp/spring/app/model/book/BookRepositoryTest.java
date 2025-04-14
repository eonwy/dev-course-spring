package com.grepp.spring.app.model.book;

import static org.junit.jupiter.api.Assertions.*;

import com.grepp.spring.app.model.book.code.Category;
import com.grepp.spring.app.model.book.dto.Book;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {
    "file:src/main/webapp/WEB-INF/spring/root-context.xml",
    "file:src/main/webapp/WEB-INF/spring/servlet-context.xml"
})
@Slf4j
class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void selectAll() {
        log.info("all books : {} ", bookRepository.selectAll());
    }

    @Test
    public void selectById() {
        log.info("all books by id : {} ", bookRepository.selectById(1000));
    }

    @Test
    public void insert() {
        Book book = new Book();
        book.setCategory(Category.HUMANITY);
        book.setTitle("우아왕");
        book.setAuthor("에옹이");
        book.setInfo("어려운 책입니다");
        bookRepository.insert(book);
        log.info("insert book : {} ", book);
    }

    @Test
    public void update() {
        Book book = new Book();
        book.setBkIdx(1005);
        book.setCategory(Category.NOVEL);
        book.setTitle("수정을~!!!");
        book.setAuthor("우헤헤");
        bookRepository.update(book);
        log.info("book : {} ", bookRepository.update(book));
    }

    @Test
    public void delete() {
        log.info("delete : {}", bookRepository.delete(1005));
    }

    @Test
    public void selectByTitle() {
        log.info("selectByTitle : {}", bookRepository.selectByTitle("리"));
    }

    @Test
    public void recentRentBook() {
        log.info("recentRentBook : {}", bookRepository.recentRentBook(2));
    }

    @Test
    @DisplayName("키워드를 사용해 제목 또는 작가 또는 상세 검색")
    public void selectIf(){
        log.info("{}", bookRepository.selectByIf("author", "에"));
    }
    @Test
    @DisplayName("키워드를 사용해 제목 또는 작가 또는 상세 검색")
    public void selectByChooseWhen(){
        log.info("{}", bookRepository.selectByChooseWhen("author", "에"));
    }

    @Test
    public void bulkInsert() {
        Book test1 = new Book(Category.HUMANITY, "테스트1", "테스트1", "테스트 도서입니다.");
        Book test2 = new Book(Category.HUMANITY, "테스트2", "테스트2", "테스트 도서입니다.");

        bookRepository.bulkInsert(List.of(test1, test2));
    }

    @Test
    public void selectDynamic() {
        log.info("selectDynamic : {}", bookRepository.selectDynamic(List.of("author", "title"), "디디"));
    }
}