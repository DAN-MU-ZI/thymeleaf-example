package com.example.thymeleafexample.business.repositories;

import com.example.thymeleafexample.business.entities.SeedStarter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SeedStarterRepository {
    private final List<SeedStarter> seedStarters = new ArrayList<SeedStarter>();


    public SeedStarterRepository() {
        super();
    }


    public List<SeedStarter> findAll() {
        return new ArrayList<>(seedStarters);
    }


    public void add(final SeedStarter seedStarter) {
        seedStarters.add(seedStarter);
    }
}
