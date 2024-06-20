package com.keyin.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/event/{id}")
    public Event getEvent(@PathVariable int eventId) {
        return eventService.getEventId(eventId);
    }

    @PostMapping("/event")
    public Event createEvent(@RequestBody Event newEvent) {
        return eventService.createEvent(newEvent);
    }

    @PutMapping("/event/{id}")
    public Event updateEvent(@PathVariable int eventId, @RequestBody Event updatedEvent) {
        return eventService.updateEvent(eventId, updatedEvent);
    }

    @DeleteMapping("/event/{id}")
    public void deleteEvent(@PathVariable int eventId) {
        eventService.deleteEvent(eventId);
    }

    @PostMapping("/event/{id}/attendees")
    public Event addAttendeesToEvent(@PathVariable int eventId, @RequestBody List<Integer> attendees) {
        return eventService.addAttendeesToEvent(eventId, attendees);
    }
}
