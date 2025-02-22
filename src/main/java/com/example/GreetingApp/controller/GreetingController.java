package com.example.GreetingApp.controller;

import com.example.GreetingApp.entity.GreetingRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    private String currentGreeting = "Hello, World!";

    //GET method
    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"" + currentGreeting + "\"}";
    }

    //POST method
    @PostMapping
    public String createGreeting(@RequestBody GreetingRequest request) {
        currentGreeting = "Hello, " + request.getName() + "!";
        return "{\"message\": \"" + currentGreeting + "\"}";
    }

    //PUT method
    @PutMapping
    public String updateGreeting(@RequestBody GreetingRequest request) {
        currentGreeting = "Hello, " + request.getName() + "!";
        return "{\"message\": \"" + currentGreeting + "\"}";
    }

    //DELETE method
    @DeleteMapping
    public String deleteGreeting() {
        currentGreeting = "Greeting deleted";
        return "{\"message\": \"" + currentGreeting + "\"}";
    }

}
