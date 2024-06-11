package com.navr.springsec.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        value = "/api/v1",
        method = {RequestMethod.POST, RequestMethod.GET},
        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.ALL_VALUE},
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class WelcomeController {

    @GetMapping(
            value = "/welcome",
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String sayWelcome() {
        System.out.println("Inside sayWelcome() method ...");
        return "Welcome world!";
    }
}
