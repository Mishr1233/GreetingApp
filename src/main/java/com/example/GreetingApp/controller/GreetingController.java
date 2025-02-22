package com.example.GreetingApp.controller;

import com.example.GreetingApp.entity.GreetingRequest;
import com.example.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    private String currentGreeting = "Hello, World!";

    private final GreetingService greetingService;

    //Inject GreetingService into the controller
    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String Greeting() {
        //Use the service to get the greeting
        String message = greetingService.getSimpleGreeting();
        return "{\"message\": \"" + message + "\"}";
    }
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
