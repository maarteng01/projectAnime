package com.example.projectanime.controllers;

import com.example.projectanime.model.Manga;
import com.example.projectanime.repositories.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class MangaController {
    @Autowired
    private MangaRepository mangaRepository;

    @GetMapping("/mangalist")
    public String mangaList(Model model){
        Iterable<Manga> mangasFromDb = mangaRepository.findAll();
        model.addAttribute("mangas", mangasFromDb);
        return "mangaList";
    }

    @GetMapping({"/mangadetails", "/mangadetails/{id}"})
    public String mangadetails(Model model, @PathVariable(required = false) Integer id){
        if(id == null) return "mangaDetails";
        Optional<Manga> mangaFromDb = mangaRepository.findById(id);
        if(mangaFromDb.isPresent()){
            model.addAttribute("manga", mangaFromDb.get());
        }
        return "mangaDetails";
    }

    @GetMapping({"/mangadetails/{id}/prev"})
    public String mangadetailsPrev(Model model, @PathVariable int id) {
        Optional<Manga> prevMangaFromDb = mangaRepository.findFirstByIdLessThanOrderByIdDesc(id);
        if (prevMangaFromDb.isPresent())
            return String.format("redirect:/mangadetails/%d", prevMangaFromDb.get().getId());
        Optional<Manga> lastMangaFromDb = mangaRepository.findFirstByOrderByIdDesc();
        if (lastMangaFromDb.isPresent())
            return String.format("redirect:/mangadetails/%d", lastMangaFromDb.get().getId());
        return "mangaDetails";
    }

    @GetMapping({"/mangadetails/{id}/next"})
    public String mangadetailsNext(Model model, @PathVariable int id) {
        Optional<Manga> nextMangaFromDb = mangaRepository.findFirstByIdGreaterThanOrderByIdAsc(id);
        if (nextMangaFromDb.isPresent())
            return String.format("redirect:/mangadetails/%d", nextMangaFromDb.get().getId());
        Optional<Manga> firstMangaFromDb = mangaRepository.findFirstByOrderByIdAsc();
        if (firstMangaFromDb.isPresent())
            return String.format("redirect:/mangadetails/%d", firstMangaFromDb.get().getId());
        return "mangaDetails";
    }
}
