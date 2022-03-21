package com.example.projectanime.controllers;

import com.example.projectanime.repositories.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnimeController {
    @Autowired
    private AnimeRepository animeRepository;
}
