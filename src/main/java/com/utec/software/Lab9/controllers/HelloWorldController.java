package com.utec.software.Lab9.controllers;

import com.utec.software.Lab9.data.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("OWO");
        return "Hola Mundo";
    }

    @PostMapping("/hello")
    public String hello_post(@RequestBody User user) {
        System.out.println("post");
        return user.username;
    }
}
