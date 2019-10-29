package com.dku.springstudy.controller;

import com.dku.springstudy.model.UserVO;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class LoginController {

    @GetMapping("login")
    public String loginGet(@RequestParam(value = "id") String id,
                         @RequestParam(value = "password") String password) {

        UserVO user = new UserVO();

        if(user.getId().equals(id) && user.getPassword().equals(password)) {
            return "Login succeed.";
        }

        else {
            return "Login failed";
        }
    }

    @PostMapping("login")
    public String loginPost(@RequestParam(value = "id") String id,
                            @RequestParam(value = "password") String password) {

        UserVO user = new UserVO();

        System.out.println(user.getId());
        System.out.println(user.getPassword());

        if(user.getId().equals(id) && user.getPassword().equals(password)) {
            return "login succeed";
        }

        else {
            return "Login failed";
        }
    }
}
