package com.example.projectanime.repositories;

import com.example.projectanime.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
    Optional<Author> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Author> findFirstByOrderByIdDesc();
    Optional<Author> findFirstByIdGreaterThanOrderByIdAsc(Integer id);
    Optional<Author> findFirstByOrderByIdAsc();
}
