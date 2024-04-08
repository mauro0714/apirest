package com.sena.apirest.Persona;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor 

public class PersonService {
    private final PersonRepository personRepo;

    public void createPersona(Person person) 
    {
        personRepo.save(person);
        
    }
    
}
