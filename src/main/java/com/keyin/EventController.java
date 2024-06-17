package com.keyin;

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
    public Event getEvent(@PathVariable Long id) {
        return eventService.getEvent(id);
    }

    @PostMapping("/event")
    public Event createEvent(@RequestBody Event newEvent) {
        return eventService.createEvent(newEvent);
    }

    @PutMapping("/event/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event updatedEvent) {
        return eventService.updateEvent(id, updatedEvent);
    }

    @DeleteMapping("/event/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
    }

    @PostMapping("/event/{id}/attendees")
    public Event addAttendeesToEvent(@PathVariable Long id, @RequestBody List<String> attendees) {
        return eventService.addAttendeesToEvent(id, attendees);
    }
}
