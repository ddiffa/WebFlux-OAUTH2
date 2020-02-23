package com.ddiffa.springexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        return "Oauth Spring Boot Documentation <br> <a href=\"https://documenter.getpostman.com/view/6149286/SzKVRHx3?version=latest\"> Documentation Postman </a>";
    }
}
