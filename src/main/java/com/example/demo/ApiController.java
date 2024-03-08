package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final UserService userService;

    public ApiController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test/{id}")
    public String hello(@PathVariable Long id) {
        return "Test api ";
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    // Thymeleaf beginning
    /*@GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users-list";
    }*/
}

//hosted on git
//TODO SPRING DATA & REPO,
// READ ABOUT REST - DONE (https://www.codecademy.com/article/what-is-rest)
// MAKE THE CRUD - DONE (https://www.codecademy.com/article/what-is-crud)
//thymeleaf as template?
//n-tier (repository) atchitecture


//zosto go nema flyway i run as na pom.xml
//user vo json format - controllerot ne go vrakja
//template
//DONE site rest operacii od controllerot deleteUser
