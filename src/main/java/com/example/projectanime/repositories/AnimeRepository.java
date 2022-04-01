package com.example.projectanime.repositories;

import com.example.projectanime.model.Anime;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AnimeRepository extends CrudRepository<Anime, Integer> {
       @Query("SELECT an FROM Anime an WHERE " +
               "(:minRating IS NULL OR :minRating <= an.rating) AND " +
               "(:maxRating IS NULL OR an.rating <= :maxRating) and" +
               "(:searchAnime is null or upper(an.name) like upper(concat('%',:searchAnime,'%')))")
               List<Anime> findByFilter(@Param("minRating") Double minRating,@Param("maxRating") Double maxRating, @Param("searchAnime") String searchAnime);

    Optional<Anime> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Anime> findFirstByOrderByIdDesc();
    Optional<Anime> findFirstByIdGreaterThanOrderByIdAsc(Integer id);
    Optional<Anime> findFirstByOrderByIdAsc();
}
