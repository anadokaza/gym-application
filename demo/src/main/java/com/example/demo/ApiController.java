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
//TODO SPRING DATA & REPO, READ ABOUT REST, CRUD
