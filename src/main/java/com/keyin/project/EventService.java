package com.keyin.project;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EventService {

    private Map<Integer, Event> events = new HashMap<>();

    public Event getEventId(int eventId) {
        return events.get(eventId);
    }

    public Event createEvent(Event newEvent) {
        events.put(events.size() + 1, newEvent);
        return newEvent;
    }

    public List<Event> getAllEvents() {
        return new ArrayList<>(events.values());
    }

    public Event updateEvent(int eventId, Event updatedEvent) {
        events.put(eventId, updatedEvent);
        return updatedEvent;
    }

    public void deleteEvent(int id) {
        events.remove(id);
    }

    public Event addAttendeesToEvent(int eventId, List<Integer> attendees) {
        Event event = getEventId(eventId);
        if (event != null) {
            event.setAttendees(attendees);
        }
        return event;
    }
}