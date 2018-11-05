package com.webservices.example.librarydatabaseservice.service;

import com.webservices.example.librarydatabaseservice.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


@RunWith(SpringRunner.class)
@SpringBootTest()
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@TestPropertySource(locations="classpath:application-test.properties")
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void addNewBookTest() {
        assertEquals(0, bookService.findAllBook().size());
        bookService.addNewBook(new Book(1L, "test", "test", 200, "test"));
        assertEquals(1, bookService.findAllBook().size());
    }

    @Test
    @Sql({"/book/book.sql"})
    public void findBookByIdTest() {
        Book bookById = bookService.findBookById(1L);
        assertNotEquals(null, bookById);
        assertEquals("First Man", bookById.getTitle());
    }

    @Test
    @Sql({"/book/book.sql"})
    public void findBookByTitleTest() {
        Book bookByTitle = bookService.findBookByTitle("First Man");
        assertNotEquals(null, bookByTitle);
        assertEquals("First Man", bookByTitle.getTitle());
    }

    @Test
    @Sql({"/book/book.sql"})
    public void findBooksByAuthorTest() {
        List<Book> booksByAuthor = bookService.findBooksByAuthor("Hawking");
        assertNotEquals(0, booksByAuthor.size());
        assertEquals("Hawking", booksByAuthor.get(0).getAuthor());
    }

    @Test
    @Sql({"/book/book.sql"})
    public void findBooksByLanguagesTest() {
        List<Book> booksByLanguages = bookService.findBooksByLanguages("ENG");
        assertNotEquals(0, booksByLanguages.size());
        assertEquals("ENG", booksByLanguages.get(0).getLanguage());
    }

    @Test
    @Sql({"/book/book.sql"})
    public void findAllBookTest() {
        List<Book> allBook = bookService.findAllBook();
        assertNotEquals(0, allBook.size());
        assertEquals("First Man", allBook.get(0).getTitle());
    }

    @Test
    @Sql({"/book/book.sql"})
    public void removeBookTest() {
        assertEquals(1, bookService.findAllBook().size());
        bookService.removeBook(1L);
        assertEquals(0, bookService.findAllBook().size());
    }
}
