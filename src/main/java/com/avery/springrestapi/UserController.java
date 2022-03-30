package com.avery.springrestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @GetMapping("/me")
    public User user(@RequestParam(value = "name", defaultValue = "Avery") String name) {
        return new User(name);
    }
}
