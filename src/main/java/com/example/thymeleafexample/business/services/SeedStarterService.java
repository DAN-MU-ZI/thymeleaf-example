package com.example.thymeleafexample.business.services;

import com.example.thymeleafexample.business.entities.SeedStarter;
import com.example.thymeleafexample.business.repositories.SeedStarterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeedStarterService {
    @Autowired
    private SeedStarterRepository seedStarterRepository;


    public SeedStarterService() {
        super();
    }


    public List<SeedStarter> findAll() {
        return seedStarterRepository.findAll();
    }

    public void add(final SeedStarter seedStarter) {
        seedStarterRepository.add(seedStarter);
    }
}
