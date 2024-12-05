package com.example.kaijote.Record.Shop.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "Welcome to the Record Shop";
    }

}
