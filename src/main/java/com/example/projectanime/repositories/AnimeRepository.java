package com.example.projectanime.repositories;

import com.example.projectanime.model.Anime;
import org.springframework.data.repository.CrudRepository;

public interface AnimeRepository extends CrudRepository<Anime, Integer> {
}
