package com.example.GreetingApp.service;

import com.example.GreetingApp.entity.Greeting;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GreetingService {

    private final Map<String, Greeting> greetingsMap = new HashMap<>();


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


    public Greeting saveGreetingMessage(String firstName, String lastName, String message) {
        String key = firstName + "_" + lastName;
        Greeting greeting = new Greeting();
        greeting.setFirstName(firstName);
        greeting.setLastName(lastName);
        greeting.setMessage(message);

        greetingsMap.put(key, greeting);  //Save greeting to in-memory map
        return greeting;
    }

    public Greeting getGreetingByName(String firstName, String lastName) {
        String key = firstName + "_" + lastName;
        return greetingsMap.get(key);  //Retrieve the greeting from the map
    }
}





