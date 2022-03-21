package com.example.projectanime.controllers;

import com.example.projectanime.repositories.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MangaController {
    @Autowired
    private MangaRepository mangaRepository;
}
