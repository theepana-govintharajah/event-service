package com.example.eventservice.service;


import com.example.eventservice.dto.EventRequest;
import com.example.eventservice.dto.EventResponse;
import com.example.eventservice.model.Event;
import com.example.eventservice.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventService {

    private final EventRepository eventRepository;

    public void createEvent(EventRequest eventRequest) {
        log.info("Executing event");
        Event event=Event.builder()
                .name(eventRequest.getName())
                .venue(eventRequest.getVenue())
                .startDate(eventRequest.getStartDate())
                .build();
        eventRepository.save(event);
        log.info("Event {} is saved", event.getId());
    }

    public List<EventResponse> getAllEvents() {
        List <Event> organizations= eventRepository.findAll();
        return organizations.stream().map(this::mapToEventResponse).toList();
    }

    private EventResponse mapToEventResponse(Event event) {
        return EventResponse.builder()
                .id(event.getId())
                .name(event.getName())
                .venue(event.getVenue())
                .startDate(event.getStartDate())
                .build();
    }
}
