package com.example.projectanime.repositories;

import com.example.projectanime.model.Manga;
import org.springframework.data.repository.CrudRepository;

public interface MangaRepository extends CrudRepository<Manga, Integer> {
}
