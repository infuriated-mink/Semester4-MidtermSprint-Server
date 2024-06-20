package com.keyin.project;

import java.util.List;

public class Event {
    private int eventId;
    private String eventName;
    private String date;
    private int venueId;
    private List<Integer> attendees;

    public Event(int eventId, String eventName, String date, int venueId, List<Integer> attendees) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.venueId = venueId;
        this.attendees = attendees;
    }


    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Integer> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Integer> attendees) {
        this.attendees = attendees;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }
}
