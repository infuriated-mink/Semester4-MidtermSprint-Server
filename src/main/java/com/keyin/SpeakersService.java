package com.keyin;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpeakersService {

    private Map<Long, Speakers> speakersMap = new HashMap<>();

    public Speakers getSpeaker(Long id) {
        return speakersMap.get(id);
    }

    public Speakers createSpeaker(Speakers newSpeaker) {
        speakersMap.put(speakersMap.size() + 1L, newSpeaker);
        return newSpeaker;
    }

    public List<Speakers> getAllSpeakers() {
        return new ArrayList<>(speakersMap.values());
    }

    public Speakers updateSpeaker(Long id, Speakers updatedSpeaker) {
        Speakers speakerToUpdate = speakersMap.get(id);
        if (speakerToUpdate != null) {
            speakerToUpdate.setSpeakerName(updatedSpeaker.getSpeakerName());
            speakerToUpdate.setTopic(updatedSpeaker.getTopic());
        }
        return speakerToUpdate;
    }

    public void deleteSpeaker(Long id) {
        speakersMap.remove(id);
    }
}
