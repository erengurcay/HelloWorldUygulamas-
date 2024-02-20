package com.javaspringboot.springBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //localhost:8080/hello ---> hello world
    @GetMapping (path = "/hello")
    public String sayHello(){
        return "Hello World!";
    }

}

