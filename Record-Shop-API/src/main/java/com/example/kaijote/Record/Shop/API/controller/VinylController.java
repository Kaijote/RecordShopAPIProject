package com.example.kaijote.Record.Shop.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.kaijote.Record.Shop.API.service.*;
import com.example.kaijote.Record.Shop.API.model.*;

@RestController
public class VinylController {

    //TODO: dependency injection of service
    private final VinylService service;

    @Autowired
    public VinylController(VinylService service){
        this.service = service;
    }

    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "Welcome to the Record Shop";
    }

}
