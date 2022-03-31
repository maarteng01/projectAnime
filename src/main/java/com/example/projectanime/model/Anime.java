package com.example.projectanime.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Anime {
    @Id
    private Integer id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date airingsDate;
    @Temporal(TemporalType.DATE)
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
}
