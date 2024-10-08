package com.navr.oauthclient.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = {"/oauth-client-demo"})
public class OAuthClientDemoController {

    @GetMapping("/welcome")
    public String demo() {
        return "this is a welcome message";
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.printf("username=%s%n", principal.getName());
        return principal;
    }
}
