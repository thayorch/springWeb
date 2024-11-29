package com.martinez.webspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index"; // Renders templates/index.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Renders templates/contact.html
    }

    @GetMapping("/features")
    public String features() {
        return "features"; // Renders templates/features.html
    }
}
