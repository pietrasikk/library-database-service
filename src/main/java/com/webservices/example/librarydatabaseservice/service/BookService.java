package com.webservices.example.librarydatabaseservice.service;

import com.webservices.example.librarydatabaseservice.model.Book;

import java.util.List;

public interface BookService {

    void addNewBook(Book newBook);

    Book findBookById(Long bookId);

    Book findBookByTitle(String title);

    List<Book> findBooksByAuthor(String author);

    List<Book> findBooksByLanguages(String language);

    List<Book> findAllBook();

    void removeBook(Long id);
}
