package com.example.projectanime.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Studio {
    @Id
    private Integer id;
    private String name;
    @Column(length = 500)
    private String bio;
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Anime> animes;

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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Collection<Anime> getAnimes() {
        return animes;
    }

    public void setAnimes(Collection<Anime> animes) {
        this.animes = animes;
    }
}
