package com.example.eventservice.service;


import com.example.eventservice.dto.EventRequest;
import com.example.eventservice.model.Event;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EventService {


    public void createEvent (EventRequest eventRequest) {
        Event event=new Event();

    }
}
