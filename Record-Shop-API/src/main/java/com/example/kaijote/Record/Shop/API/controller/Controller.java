package com.example.kaijote.Record.Shop.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //TODO: dependency injection of service
    @Autowired
    public Controller(){

    }

    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "Welcome to the Record Shop";
    }

}
