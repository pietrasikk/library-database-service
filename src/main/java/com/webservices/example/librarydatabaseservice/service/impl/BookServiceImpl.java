package com.webservices.example.librarydatabaseservice.service.impl;

import com.webservices.example.librarydatabaseservice.model.Book;
import com.webservices.example.librarydatabaseservice.repository.BookRepository;
import com.webservices.example.librarydatabaseservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void addNewBook(Book newBook) {
        bookRepository.save(newBook);
    }

    @Override
    public Book findBookById(Long bookId) {
        return bookRepository.findById(bookId).orElse(new Book());
    }

    @Override
    public Book findBookByTitle(String title) {
        return bookRepository.findBookByTitle(title).orElse(new Book());
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        return bookRepository.findBooksByAuthor(author);
    }

    @Override
    public List<Book> findBooksByLanguages(String language) {
        return bookRepository.findBooksByLanguages(language);
    }

    @Override
    public List<Book> findAllBook() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public void removeBook(Long id) {
        bookRepository.findById(id).ifPresent(record -> bookRepository.deleteById(id));
    }
}
