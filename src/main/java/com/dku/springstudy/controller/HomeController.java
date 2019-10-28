package com.dku.springstudy.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class HomeController {

    @RequestMapping("/get")
    public String test(@RequestParam(name="values") String asdf) {
        return asdf;
    }

    @PostMapping("/post")
    public String test2(String name) {
        return name;
    }
}