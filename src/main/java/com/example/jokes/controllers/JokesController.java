package com.example.jokes.controllers;

import com.example.jokes.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tocka Ayman
 * @date 8/11/20
 */
@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/")
    public String getRandomJoke(Model model) {
        model.addAttribute("joke", jokesService.getRandomJoke());
        
        return "jokes/chucknorris";
    }
}
