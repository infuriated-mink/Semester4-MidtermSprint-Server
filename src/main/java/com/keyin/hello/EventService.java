package com.keyin.hello;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EventService {

    private Map<Long, Event> events = new HashMap<>();

    public Event getEvent(Long id) {
        return events.get(id);
    }

    public Event createEvent(Event newEvent) {
        events.put(events.size() + 1L, newEvent);
        return newEvent;
    }

    public List<Event> getAllEvents() {
        return new ArrayList<>(events.values());
    }

    public Event updateEvent(Long id, Event updatedEvent) {
        events.put(id, updatedEvent);
        return updatedEvent;
    }

    public void deleteEvent(Long id) {
        events.remove(id);
    }

    public Event addAttendeesToEvent(Long eventId, List<String> attendees) {
        Event event = getEvent(eventId);
        if (event != null) {
            event.setAttendees(attendees);
        }
        return event;
    }
}
