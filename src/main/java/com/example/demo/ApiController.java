package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/test/{id}")
    public String hello(@PathVariable Long id) {
        return "Test api ";
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Long id) {
        return "Test api ";
    }
}

//hosted on git
//TODO SPRING DATA & REPO,
// READ ABOUT REST - DONE (https://www.codecademy.com/article/what-is-rest)
// MAKE THE CRUD - DONE (https://www.codecademy.com/article/what-is-crud)
//thymeleaf as template?
//n-tier (repository) atchitecture
