package com.keyin;

public class Speakers {
    private Long id;
    private String speakerName;
    private String topic;

    public Speakers(Long id, String speakerName, String topic) {
        this.id = id;
        this.speakerName = speakerName;
        this.topic = topic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
