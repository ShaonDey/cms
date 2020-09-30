package com.shaondey.cms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @GetMapping
    public String conveyGreeting() {
        return "Hello World! The time is now: " + new Date();
    }

}
