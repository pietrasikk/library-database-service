package com.webservices.example.librarydatabaseservice.service.impl;

import com.webservices.example.librarydatabaseservice.model.User;
import com.webservices.example.librarydatabaseservice.repository.UserRepository;
import com.webservices.example.librarydatabaseservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addNewUser(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(new User());
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findUserByName(name).orElse(new User());
    }

    @Override
    public User findUserBySurname(String surname) {
        return userRepository.findUserBySurname(surname).orElse(new User());
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void removeUser(Long id) {
        userRepository.findById(id).ifPresent(record -> userRepository.deleteById(id));
    }
}
