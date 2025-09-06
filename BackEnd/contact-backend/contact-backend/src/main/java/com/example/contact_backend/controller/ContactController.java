package com.example.contact_backend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @PostMapping("/submit")
    public String handleFormSubmission(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("message") String message) {
        
        // Print submitted data to console
        System.out.println("Received form submission:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);
        
        // Return a simple response to the frontend (optional, but good for confirmation)
        return "Form submitted successfully!";
    }
}
