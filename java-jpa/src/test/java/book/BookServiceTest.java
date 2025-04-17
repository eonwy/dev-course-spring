package book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookServiceTest {

    private final BookService bookService =  new BookService();

    @Test
    public void add() {
        Book book = new Book();
        book.setTitle("Book Title");
        book.setAuthor("Author");
        bookService.add(book);

    }
}