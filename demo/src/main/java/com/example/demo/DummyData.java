package com.example.demo;

import com.example.demo.Model.VideoCasette;
import com.example.demo.Repository.VideoCasetteRepo;
import com.example.demo.Service.VideoCasetteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DummyData {

    VideoCasetteService videoCasetteService;

    @Autowired

    public DummyData(VideoCasetteService videoCasetteService) {
        this.videoCasetteService = videoCasetteService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fill() {

        videoCasetteService.save(new VideoCasette("Wladca", LocalDate.now()));
        videoCasetteService.save(new VideoCasette("Pierścieni", LocalDate.now()));
        videoCasetteService.save(new VideoCasette("Ugabuga", LocalDate.now()));

    }
}
