package com.webservices.example.librarydatabaseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.webservices.example.librarydatabaseservice")
public class LibraryDatabaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryDatabaseServiceApplication.class, args);
	}
}
