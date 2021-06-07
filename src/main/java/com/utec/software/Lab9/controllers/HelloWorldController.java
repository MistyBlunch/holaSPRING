package com.utec.software.Lab9.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("OWO");
        return "Hola Mundo";
    }
}
