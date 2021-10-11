package com.express.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("welcome")
    public String welcome() {
        return "Welcome to my 7th team - Food Express";
    }
}
