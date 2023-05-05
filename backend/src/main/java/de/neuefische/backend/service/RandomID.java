package de.neuefische.backend.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RandomID {


    public String generateId(){
        return UUID.randomUUID().toString();
    }
}
