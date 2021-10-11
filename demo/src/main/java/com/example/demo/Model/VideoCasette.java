package com.example.demo.Model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class VideoCasette {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate productionDate;

    public VideoCasette(String name, LocalDate productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    public VideoCasette(Long id, String name, LocalDate productionDate) {
        this.id = id;
        this.name = name;
        this.productionDate = productionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "VideoCasette{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }
}
