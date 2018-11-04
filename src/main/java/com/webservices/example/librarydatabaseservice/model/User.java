package com.webservices.example.librarydatabaseservice.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private Long id;

    @Column(nullable = false)
    @Setter
    @Getter
    private String name;

    @Column(nullable = false)
    @Setter
    @Getter
    private String surname;
}
