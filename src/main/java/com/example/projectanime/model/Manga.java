package com.example.projectanime.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Manga {
    @Id
    private Integer id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
