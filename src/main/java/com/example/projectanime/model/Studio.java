package com.example.projectanime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studio {
    @Id
    private Integer id;
    private String name;
    @Column(length = 500)
    private String bio;
}
