package com.example.projectanime.repositories;

import com.example.projectanime.model.Anime;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AnimeRepository extends CrudRepository<Anime, Integer> {
    Optional<Anime> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Anime> findFirstByOrderByIdDesc();
    Optional<Anime> findFirstByIdGreaterThanOrderByIdAsc(Integer id);
    Optional<Anime> findFirstByOrderByIdAsc();
}
