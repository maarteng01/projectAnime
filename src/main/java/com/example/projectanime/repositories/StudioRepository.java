package com.example.projectanime.repositories;

import com.example.projectanime.model.Studio;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudioRepository extends CrudRepository<Studio, Integer> {
    Optional<Studio> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Studio> findFirstByOrderByIdDesc();
    Optional<Studio> findFirstByIdGreaterThanOrderByIdAsc(Integer id);
    Optional<Studio> findFirstByOrderByIdAsc();
}
