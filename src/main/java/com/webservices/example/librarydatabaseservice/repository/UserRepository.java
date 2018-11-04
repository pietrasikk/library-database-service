package com.webservices.example.librarydatabaseservice.repository;

import com.webservices.example.librarydatabaseservice.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findUserByName(String name);

    Optional<User>  findUserBySurname(String surname);
}
