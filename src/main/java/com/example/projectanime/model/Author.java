package com.example.projectanime.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Author {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private Date birthDate;
}
