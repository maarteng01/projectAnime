package com.example.projectanime.controllers;

import com.example.projectanime.model.Author;
import com.example.projectanime.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/authorlist")
    public String authorList(Model model){
        Iterable<Author> authorsFromDb = authorRepository.findAll();
        model.addAttribute("authors", authorsFromDb);
        return "animeList";
    }

    @GetMapping({"/authordetails", "/authordetails/{id}"})
    public String authordetails(Model model, @PathVariable(required = false) Integer id){
        if(id == null) return "authordetails";
        Optional<Author> authorFromDb = authorRepository.findById(id);
        if(authorFromDb.isPresent()){
            model.addAttribute("author", authorFromDb.get());
        }
        return "authorDetails";
    }

    @GetMapping({"/authordetails/{id}/prev"})
    public String authordetailsPrev(Model model, @PathVariable int id) {
        Optional<Author> prevAuthorFromDb = authorRepository.findFirstByIdLessThanOrderByIdDesc(id);
        if (prevAuthorFromDb.isPresent())
            return String.format("redirect:/authordetails/%d", prevAuthorFromDb.get().getId());
        Optional<Author> lastAuthorFromDb = authorRepository.findFirstByOrderByIdDesc();
        if (lastAuthorFromDb.isPresent())
            return String.format("redirect:/authordetails/%d", lastAuthorFromDb.get().getId());
        return "authorDetails";
    }

    @GetMapping({"/authordetails/{id}/next"})
    public String authordetailsNext(Model model, @PathVariable int id) {
        Optional<Author> nextAuthorFromDb = authorRepository.findFirstByIdGreaterThanOrderByIdAsc(id);
        if (nextAuthorFromDb.isPresent())
            return String.format("redirect:/authordetails/%d", nextAuthorFromDb.get().getId());
        Optional<Author> firstAuthorFromDb = authorRepository.findFirstByOrderByIdAsc();
        if (firstAuthorFromDb.isPresent())
            return String.format("redirect:/authordetails/%d", firstAuthorFromDb.get().getId());
        return "authorDetails";
    }
}
