package com.barberscheduler.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class TestingController {

    @GetMapping
    public String testandoController(){
        return "Hello Test";
    }
}
