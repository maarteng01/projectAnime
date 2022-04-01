package com.example.projectanime.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Anime {
    @Id
    private Integer id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date airingsDate;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private Double rating;

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

    public Date getAiringsDate() {
        return airingsDate;
    }

    public void setAiringsDate(Date airingsDate) {
        this.airingsDate = airingsDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @ManyToMany(mappedBy = "animes")
    private Collection<Studio> studios;

    public Collection<Studio> getStudios() {
        return studios;
    }

    public void setStudios(Collection<Studio> studios) {
        this.studios = studios;
    }
}
