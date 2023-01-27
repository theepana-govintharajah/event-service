package com.example.eventservice.controller;



import com.example.eventservice.dto.EventRequest;
import com.example.eventservice.dto.EventResponse;
import com.example.eventservice.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createEvent (@RequestBody EventRequest eventRequest) {
        return "Event created successfully";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EventResponse> getAllOrganizations(){
        return eventService.getAllEvents();
    }


}
