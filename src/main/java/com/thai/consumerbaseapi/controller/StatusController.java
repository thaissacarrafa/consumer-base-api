package com.thai.consumerbaseapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    //criar um método pra saber se o servidor está online
    @GetMapping(path = "/api/status")
    public String check () {
        return "Seu servidor está Online";
    }

}
