package com.example.projectanime.repositories;

import com.example.projectanime.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
