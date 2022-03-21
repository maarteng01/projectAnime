package com.example.projectanime.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Anime {
    @Id
    private Integer id;
    private String name;
    private Date startDate;
    private Date endDate;
    private int rating;
}
