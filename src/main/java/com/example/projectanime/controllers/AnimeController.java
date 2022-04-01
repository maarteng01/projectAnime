package com.example.projectanime.controllers;

import com.example.projectanime.model.Anime;
import com.example.projectanime.model.Studio;
import com.example.projectanime.repositories.AnimeRepository;
import com.example.projectanime.repositories.StudioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;


@Controller
public class AnimeController {
    @Autowired
    private AnimeRepository animeRepository;
    final private Logger logger = LoggerFactory.getLogger(AnimeController.class);

    @GetMapping("/animelist")
    public String animeList(Model model, @RequestParam(required = false) Double minRating,
                            @RequestParam(required = false) Double maxRating,
                            @RequestParam(required = false) String searchAnime){

        // Filter wordt opgeroepen om alle animes te vinden, BEHALVE als de filter een null mee krijgt als filter waarde.
        Iterable<Anime> animes = animeRepository.findByFilter(minRating,maxRating, searchAnime);

        model.addAttribute("animes", animes);
        return "animeList";
    }

    @GetMapping({"/animedetails", "/animedetails/{id}"})
    public String animedetails(Model model, @PathVariable(required = false) Integer id){
        if(id == null) return "animeDetails";
        Optional<Anime> animeFromDb = animeRepository.findById(id);
        if(animeFromDb.isPresent()){
            model.addAttribute("anime", animeFromDb.get());
        }
        return "animeDetails";
    }



    @GetMapping({"/animedetails/{id}/prev"})
    public String animedetailsPrev(Model model, @PathVariable int id) {
        Optional<Anime> prevAnimeFromDb = animeRepository.findFirstByIdLessThanOrderByIdDesc(id);
        if (prevAnimeFromDb.isPresent())
            return String.format("redirect:/animedetails/%d", prevAnimeFromDb.get().getId());
        Optional<Anime> lastAnimeFromDb = animeRepository.findFirstByOrderByIdDesc();
        if (lastAnimeFromDb.isPresent())
            return String.format("redirect:/partydetails/%d", lastAnimeFromDb.get().getId());
        return "animeDetails";
    }

    @GetMapping({"/animedetails/{id}/next"})
    public String animedetailsNext(Model model, @PathVariable int id) {
        Optional<Anime> nextAnimeFromDb = animeRepository.findFirstByIdGreaterThanOrderByIdAsc(id);
        if (nextAnimeFromDb.isPresent())
            return String.format("redirect:/animedetails/%d", nextAnimeFromDb.get().getId());
        Optional<Anime> firstAnimeFromDb = animeRepository.findFirstByOrderByIdAsc();
        if (firstAnimeFromDb.isPresent())
            return String.format("redirect:/animedetails/%d", firstAnimeFromDb.get().getId());
        return "animeDetails";
    }
}
