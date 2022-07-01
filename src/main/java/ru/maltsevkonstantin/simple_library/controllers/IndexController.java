package ru.maltsevkonstantin.simple_library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/library")
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }
}
