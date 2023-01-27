package com.example.eventservice.service;


import com.example.eventservice.dto.EventRequest;
import com.example.eventservice.model.Event;
import com.example.eventservice.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventService {

    private final EventRepository eventRepository;

    public void createEvent(EventRequest eventRequest) {

        Event event=Event.builder()
                .name(eventRequest.getName())
                .venue(eventRequest.getVenue())
                .startDate(eventRequest.getStartDate())
                .build();
        eventRepository.save(event);
        log.info("Event {} is saved", event.getId());
    }
}
