package com.example.projectanime.controllers;

import com.example.projectanime.model.Studio;
import com.example.projectanime.repositories.StudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class StudioController {
    @Autowired
    private StudioRepository studioRepository;

    @GetMapping("/studiolist")
    public String studioList(Model model){
        Iterable<Studio> studiosFromDb = studioRepository.findAll();
        model.addAttribute("studios", studiosFromDb);
        return "studioList";
    }

    @GetMapping({"/studiodetails", "/studiodetails/{id}"})
    public String studioDetails(Model model, @PathVariable(required = false) Integer id){
        if(id == null) return "studioDetails";
        Optional<Studio> studioFromDb = studioRepository.findById(id);
        if(studioFromDb.isPresent()){
            model.addAttribute("studio", studioFromDb.get());
        }
        return "studioDetails";
    }

    @GetMapping({"/studiodetails/{id}/prev"})
    public String studiodetailsPrev(Model model, @PathVariable int id) {
        Optional<Studio> prevStudioFromDb = studioRepository.findFirstByIdLessThanOrderByIdDesc(id);
        if (prevStudioFromDb.isPresent())
            return String.format("redirect:/studiodetails/%d", prevStudioFromDb.get().getId());
        Optional<Studio> lastStudioFromDb = studioRepository.findFirstByOrderByIdDesc();
        if (lastStudioFromDb.isPresent())
            return String.format("redirect:/studiodetails/%d", lastStudioFromDb.get().getId());
        return "studioDetails";
    }

    @GetMapping({"/studiodetails/{id}/next"})
    public String studiodetailsNext(Model model, @PathVariable int id) {
        Optional<Studio> nextStudioFromDb = studioRepository.findFirstByIdGreaterThanOrderByIdAsc(id);
        if (nextStudioFromDb.isPresent())
            return String.format("redirect:/studiodetails/%d", nextStudioFromDb.get().getId());
        Optional<Studio> firstStudioFromDb = studioRepository.findFirstByOrderByIdAsc();
        if (firstStudioFromDb.isPresent())
            return String.format("redirect:/studiodetails/%d", firstStudioFromDb.get().getId());
        return "studioDetails";
    }
}
