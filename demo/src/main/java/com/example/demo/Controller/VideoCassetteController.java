package com.example.demo.Controller;

import com.example.demo.Model.VideoCasette;
import com.example.demo.Service.VideoCasetteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassets/")
public class VideoCassetteController {

    VideoCasetteService videoCasetteService;

    @Autowired
    public VideoCassetteController(VideoCasetteService videoCasetteService) {
        this.videoCasetteService = videoCasetteService;
    }

    @GetMapping("/all")
    public Iterable<VideoCasette> getAll(){
        return videoCasetteService.findAll();
    }

//    @GetMapping
//  public  Optional<VideoCasette> getById(@RequestParam Long index){
//
//        return videoCasetteService.findById(index);
//    }

    @GetMapping
  public  String get(){

        return "Eluwina Byku!";
    }

    @PostMapping
    public VideoCasette addVideo(@RequestBody VideoCasette videoCasette){
        return videoCasetteService.save(videoCasette);
    }

    @PutMapping
    public VideoCasette updateVideo(@RequestBody VideoCasette videoCasette){
        return videoCasetteService.update(videoCasette);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam long index){
       videoCasetteService.delete(index);
    }

}
