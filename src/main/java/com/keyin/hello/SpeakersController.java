package com.keyin.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SpeakersController {

    @Autowired
    private SpeakersService speakersService;

    @GetMapping("/speakers")
    public List<Speakers> getAllSpeakers() {
        return speakersService.getAllSpeakers();
    }

    @GetMapping("/speaker/{id}")
    public Speakers getSpeaker(@PathVariable Long id) {
        return speakersService.getSpeaker(id);
    }

    @PostMapping("/speaker")
    public Speakers createSpeaker(@RequestBody Speakers newSpeaker) {
        return speakersService.createSpeaker(newSpeaker);
    }

    @PutMapping("/speaker/{id}")
    public Speakers updateSpeaker(@PathVariable Long id, @RequestBody Speakers updatedSpeaker) {
        return speakersService.updateSpeaker(id, updatedSpeaker);
    }

    @DeleteMapping("/speaker/{id}")
    public void deleteSpeaker(@PathVariable Long id) {
        speakersService.deleteSpeaker(id);
    }
}
