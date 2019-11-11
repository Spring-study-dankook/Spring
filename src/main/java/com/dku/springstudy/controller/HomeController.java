package com.dku.springstudy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Value("${app.name}")
    String name;

    @Value("${app.description}")
    String description;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("name", name);
        model.addAttribute("description", description);
        //model.addAttribute("name", "world!!!");

        return "home";
    }
}