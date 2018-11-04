package com.webservices.example.librarydatabaseservice.service;

import com.webservices.example.librarydatabaseservice.model.User;

import java.util.List;

public interface UserService {

    void addNewUser(User newUser);

    User findUserById(Long id);

    User findUserByName(String name);

    User findUserBySurname(String surname);

    List<User> findAllUsers();

    void removeUser(Long id);
}
