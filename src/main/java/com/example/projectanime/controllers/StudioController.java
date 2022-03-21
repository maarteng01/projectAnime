package com.example.projectanime.controllers;

import com.example.projectanime.repositories.StudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudioController {
    @Autowired
    private StudioRepository studioRepository;
}
