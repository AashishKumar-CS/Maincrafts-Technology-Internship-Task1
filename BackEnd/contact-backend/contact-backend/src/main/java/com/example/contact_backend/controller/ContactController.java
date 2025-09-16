package com.example.contact_backend.controller;

import com.example.contact_backend.entity.Contact;
import com.example.contact_backend.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "*") // For testing with frontend
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/submit")
    public String handleFormSubmission(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("message") String message) {
        
        // Create a new Contact entity and save it
        Contact contact = new Contact(name, email, message);
        contactRepository.save(contact);
        
        System.out.println("Received form submission:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);
        
        return "Form submitted successfully and saved to database!";
    }

    @GetMapping("/contacts")
    public @ResponseBody Iterable<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
