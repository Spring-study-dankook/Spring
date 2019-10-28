package com.dku.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String hello(Model model) {

        model.addAttribute("title", "Oh Donggeon");
        model.addAttribute("body", "Hi!");

        return "freemarker";
    }
}
