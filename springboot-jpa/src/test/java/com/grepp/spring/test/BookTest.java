package com.grepp.spring.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class BookTest {

    @Autowired
    private BookTestRepository bookTestRepository;

    @Test
    @Transactional
    public void findAll() {
        bookTestRepository.findAll().forEach(System.out::println);
    }

    @Test
    public void count() {
        System.out.println(bookTestRepository.count());
    }

    @Test
    public void existsById() {
        bookTestRepository.existsById(1000L);
    }
}
