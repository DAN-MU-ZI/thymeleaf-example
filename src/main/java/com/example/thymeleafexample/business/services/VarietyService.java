package com.example.thymeleafexample.business.services;

import com.example.thymeleafexample.business.entities.Variety;
import com.example.thymeleafexample.business.repositories.VarietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VarietyService {
    @Autowired
    private VarietyRepository varietyRepository;

    public VarietyService() {
        super();
    }

    public List<Variety> findAll() {
        return varietyRepository.findAll();
    }

    public Variety findById(final Integer id) {
        return varietyRepository.findById(id);
    }
}
