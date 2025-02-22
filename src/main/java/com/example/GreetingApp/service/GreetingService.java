package com.example.GreetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {


    //This method returns greeting message
    public String getSimpleGreeting() {
        return "Hello World";
    }

    //This method returns a greeting message based on the provided names
    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            return "Hello, " + firstName + "!";
        } else if (lastName != null) {
            return "Hello, " + lastName + "!";
        } else {
            return "Hello World!";
        }
    }
}