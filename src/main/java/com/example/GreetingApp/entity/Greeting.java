package com.example.GreetingApp.entity;

public class Greeting {

    private String firstName;
    private String lastName;
    private String message;

    // Constructor
    public Greeting(String firstName, String lastName, String message) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
    }

    public Greeting() {

    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Greeting [firstName=" + firstName + ", lastName=" + lastName + ", message=" + message + "]";
    }
}

