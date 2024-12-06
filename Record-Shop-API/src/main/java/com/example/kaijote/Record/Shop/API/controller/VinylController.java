package com.example.kaijote.Record.Shop.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.kaijote.Record.Shop.API.service.*;
import com.example.kaijote.Record.Shop.API.model.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/vinyl")
public class VinylController {

    private final VinylService service;

    @Autowired
    public VinylController(VinylService service){
        this.service = service;
    }

    @GetMapping
    @ResponseBody
    public List<Vinyl> getAllVinylInStock(){
        return service.getAllVinylsInStock;
    }

}
