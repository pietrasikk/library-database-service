package com.webservices.example.librarydatabaseservice.repository;

import com.webservices.example.librarydatabaseservice.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface BookRepository extends CrudRepository<Book, Long> {

    Optional<Book> findBookByTitle(String title);

    List<Book> findBooksByAuthor(String author);

    //Below only for learning test purpose
    @Query("SELECT book FROM Book book WHERE book.language = :language")
    List<Book> findBooksByLanguages(@Param("language") String language);
}
