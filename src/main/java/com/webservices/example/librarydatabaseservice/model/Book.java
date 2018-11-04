package com.webservices.example.librarydatabaseservice.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private Long id;

    @Column(nullable = false)
    @Setter
    @Getter
    private String title;

    @Column(nullable = false)
    @Setter
    @Getter
    private String author;

    @Column(nullable = false)
    @Setter
    @Getter
    private Integer pages;

    @Column(nullable = false)
    @Setter
    @Getter
    private String language;
}
