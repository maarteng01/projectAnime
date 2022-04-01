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
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private AnimeRepository animeRepository;
    @Autowired
    private StudioRepository studioRepository;

    @GetMapping("/animeedit/{id}")
    public String editAnime(Model model, @PathVariable Integer id){
        if(id == null) return "admin/editAnime";
        Iterable<Studio> studios = studioRepository.findAll();
        model.addAttribute("studios", studios);
        logger.info(String.format("animeEdit -- id=%s", id));
        Optional<Anime> animeFromDb = animeRepository.findById(id);
        if(animeFromDb.isPresent()) {
            model.addAttribute("anime", animeFromDb.get());
        }
        return "admin/editAnime";
    }

    @PostMapping("animeedit/{id}")
    public String editAnimePost(Model model, @PathVariable Integer id, @ModelAttribute("anime") Anime anime){
        Optional<Anime> optionalAnime = animeRepository.findById(id);
        if (optionalAnime.isPresent()){
            Anime editedAnime = optionalAnime.get();
            editedAnime.setEndDate(anime.getEndDate());
            editedAnime.setRating(anime.getRating());
            editedAnime.setName(anime.getName());
            animeRepository.save(editedAnime);
        }
        return "redirect:/animedetails/" + id;
    }

    @GetMapping("/newanime")
    public String newAnime(Model model){
        Iterable<Studio> studios = studioRepository.findAll();
        model.addAttribute("studios", studios);
        return "newAnime";
    }

//    @ModelAttribute("anime")
//    public Anime findAnime(@PathVariable(required = false) Integer id){
//        logger.info("findAnime " + id);
//        Optional<Anime> optionalAnime = animeRepository.findById(id);
//        if(optionalAnime.isPresent()){
//            return optionalAnime.get();
//        }
//        return null;
//    }
}
