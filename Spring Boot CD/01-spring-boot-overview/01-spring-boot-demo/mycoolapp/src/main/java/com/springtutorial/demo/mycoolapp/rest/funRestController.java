package com.springtutorial.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World!";
    }

    @GetMapping("/home")
    public String sayHome()
    {
        return "Welcome Home!";
    }

}
