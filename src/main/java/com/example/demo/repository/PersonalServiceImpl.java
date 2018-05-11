package com.example.demo.repository;

import com.example.demo.model.Personal;
import com.example.demo.services.PersonalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalServiceImpl implements PersonalService {

    private PersonalRepository personalRepository;

    public PersonalServiceImpl(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    @Override
    public List<Personal> findAll() {
        return this.personalRepository.findAll();
    }
}
