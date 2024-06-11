package com.navr.springsec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping ("/mybalance")
    public String getBalanceDetails() {
        return "balanceDetails here ...";
    }
}
