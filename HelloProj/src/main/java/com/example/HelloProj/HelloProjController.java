package com.example.HelloProj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProjController {
    
    @GetMapping("/")
    public String greetings() {
        return "Hello World, Adithya";
    }
}
