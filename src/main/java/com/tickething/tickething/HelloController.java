package com.tickething.tickething;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


record Greet (String message) {}

@RestController
public class HelloController {
    @GetMapping("/")
    public Greet index() {
        return new Greet("hello bonjour");
    }
}
