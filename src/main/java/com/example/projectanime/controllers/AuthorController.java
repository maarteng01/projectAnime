package com.example.projectanime.controllers;

import com.example.projectanime.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;
}
