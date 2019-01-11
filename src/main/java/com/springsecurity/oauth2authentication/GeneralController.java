package com.springsecurity.oauth2authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {

    @GetMapping(value = "/")
    public String getText() {
        return "Dummy page but its working";
    }
}
