package com.mateus.passin.services;

import com.mateus.passin.domain.attendee.Attendee;
import com.mateus.passin.domain.event.Event;
import com.mateus.passin.dto.event.EventIdDTO;
import com.mateus.passin.dto.event.EventRequestDTO;
import com.mateus.passin.dto.event.EventResponseDTO;
import com.mateus.passin.repositories.AttendeeRepository;
import com.mateus.passin.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
    private  final EventRepository eventRepository;
    private final AttendeeRepository attendeeRepository;
    public EventResponseDTO getEventDetail(String eventId){
        Event event = this.eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found with id " + eventId));
        List<Attendee> attendeeList = this.attendeeRepository.findByEventId(eventId);
        return new EventResponseDTO(event, attendeeList.size());
    }
    public EventIdDTO createEvent(EventRequestDTO eventDTO){
        Event newEvent = new Event();
        newEvent.setTitle(eventDTO.title());
        newEvent.setDetails(eventDTO.details());
        newEvent.setMaximumAttendees((eventDTO.maximumAttendees()));
        newEvent.setSlug(createSlug(eventDTO.title()));

        this.eventRepository.save(newEvent);
        return new EventIdDTO(newEvent.getId());

    }
    private String createSlug(String text){
        String normalized = Normalizer.normalize(text, Normalizer.Form.NFD);
        return normalized.replaceAll("[\\p{InCOMBINING_DIACRITICAL_MARKS}]", "")
                .replaceAll("[^\\w\\a]", "")
                .replaceAll("\\s+", "")
                .toLowerCase();
    }
}
