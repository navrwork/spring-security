package com.navr.springsec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping ("/mycards")
    public String getCardDetails() {
        return "cardDetails here ...";
    }
}
