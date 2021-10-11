package com.example.demo.Service;

import com.example.demo.Model.VideoCasette;
import com.example.demo.Repository.VideoCasetteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoCasetteService {

    VideoCasetteRepo videoCasetteRepo;

    @Autowired
    public VideoCasetteService(VideoCasetteRepo videoCasetteRepo) {
        this.videoCasetteRepo = videoCasetteRepo;
    }

    public VideoCasette save(VideoCasette videoCasette){

      return   videoCasetteRepo.save(videoCasette);

    }

    public Optional<VideoCasette> findById(Long id){

        return   videoCasetteRepo.findById(id);

    }

    public VideoCasette update(VideoCasette videoCasette){

        return videoCasetteRepo.save(videoCasette);

    }

    public Iterable<VideoCasette> findAll(){

        return   videoCasetteRepo.findAll();

    }

    public void delete(Long index){

       videoCasetteRepo.delete(videoCasetteRepo.findById(index).get());

    }

}
