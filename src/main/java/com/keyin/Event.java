package com.keyin;


import java.util.List;

public class Event {
    private Long id;
    private String eventName;
    private String description;
    private List<String> attendees;

    public Event(Long id, String eventName, String description, List<String> attendees) {
        this.id = id;
        this.eventName = eventName;
        this.description = description;
        this.attendees = attendees;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<String> attendees) {
        this.attendees = attendees;
    }
}
