package com.example.demo.Repository;

import com.example.demo.Model.VideoCasette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCasetteRepo  extends CrudRepository<VideoCasette, Long> {



}
