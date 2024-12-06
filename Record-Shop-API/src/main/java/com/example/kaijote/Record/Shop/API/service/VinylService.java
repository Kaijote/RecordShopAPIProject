package com.example.kaijote.Record.Shop.API.service;

import com.example.kaijote.Record.Shop.API.repository.VinylRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.kaijote.Record.Shop.API.model.*;

@Service
public class VinylService {

    private final VinylRepository repository;

    @Autowired
    public VinylService(VinylRepository repository){
        this.repository = repository;
    }

}
