package com.example.projectanime.repositories;

import com.example.projectanime.model.Author;
import com.example.projectanime.model.Manga;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MangaRepository extends CrudRepository<Manga, Integer> {
    Optional<Manga> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Manga> findFirstByOrderByIdDesc();
    Optional<Manga> findFirstByIdGreaterThanOrderByIdAsc(Integer id);
    Optional<Manga> findFirstByOrderByIdAsc();

    Iterable<Manga> findByAuthor(Author author);
}
