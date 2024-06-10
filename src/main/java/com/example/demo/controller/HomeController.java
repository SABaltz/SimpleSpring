package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot with Mustache!");
        List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3");
        model.addAttribute("items", items);
        return "index";
    }
}