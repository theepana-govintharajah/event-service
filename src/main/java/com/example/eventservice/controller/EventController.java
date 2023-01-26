package com.example.eventservice.controller;



import com.example.eventservice.dto.EventRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController {
    @PostMapping
    public String createEvent (@RequestBody EventRequest eventRequest) {
        return "Event created successfully";
    }
}
