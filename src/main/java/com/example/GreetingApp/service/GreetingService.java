package com.example.GreetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    //This method returns greeting message
    public String getSimpleGreeting() {
        return "Hello World";
    }
}