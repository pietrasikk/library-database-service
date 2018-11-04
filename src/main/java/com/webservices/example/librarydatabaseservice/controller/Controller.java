package com.webservices.example.librarydatabaseservice.controller;

import com.webservices.example.librarydatabaseservice.model.Book;
import com.webservices.example.librarydatabaseservice.model.User;
import com.webservices.example.librarydatabaseservice.service.BookService;
import com.webservices.example.librarydatabaseservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    //Below userService implementation
    @PostMapping(value = "/addNewUser", consumes = "application/json")
    public void addNewUser(@RequestBody User newUser) {
        userService.addNewUser(newUser);
    }

    @GetMapping(value = "/findUserById/{id}", produces = "application/json")
    public User findUserById(@PathVariable("id") Long id) {
        return userService.findUserById(id);
    }

    @GetMapping(value = "/findUserByName/{name}", produces = "application/json")
    public User findUserByName(@PathVariable("name") String name) {
        return userService.findUserByName(name);
    }

    @GetMapping(value = "/findUserBySurname/{surname}", produces = "application/json")
    public User findUserBySurname(@PathVariable("surname") String surname) {
        return userService.findUserBySurname(surname);
    }

    @GetMapping(value = "/findAllUsers", produces = "application/json")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping(value = "/removeUser/{id}", consumes = "application/json")
    public void removeUser(@PathVariable("id") Long id) {
        userService.removeUser(id);
    }

    //Below bookService implementation
    @PostMapping(value = "/addNewBook", consumes = "application/json")
    public void addNewBook(@RequestBody Book newBook) {
        bookService.addNewBook(newBook);
    }

    @GetMapping(value = "/findBookById/{id}", produces = "application/json")
    public Book findBookById(@PathVariable("id") Long id) {
        return bookService.findBookById(id);
    }

    @GetMapping(value = "/findBookByTitle/{title}", produces = "application/json")
    public Book findBookByTitle(@PathVariable("title") String title) {
        return bookService.findBookByTitle(title);
    }

    @GetMapping(value = "/findBooksByAuthor/{author}", produces = "application/json")
    public List<Book> findBooksByAuthor(@PathVariable("author") String author) {
        return bookService.findBooksByAuthor(author);
    }

    @GetMapping(value = "/findBooksByLanguages/{language}", produces = "application/json")
    public List<Book> findBooksByLanguages(@PathVariable("language") String language) {
        return bookService.findBooksByLanguages(language);
    }

    @GetMapping(value = "/findAllBook", produces = "application/json")
    public List<Book> findAllBook() {
        return bookService.findAllBook();
    }

    @PostMapping(value = "/removeBook/{id}", consumes = "application/json")
    public void removeBook(@PathVariable("id") Long id) {
        bookService.removeBook(id);
    }
}
