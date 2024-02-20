package com.javaspringboot.springBootDemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {
    //localhost:8080/api/hello ---> hello world
    //localhost:8080/api/save
    //localhost:8080/api/delete



    // @GetMapping (path = "/hello")

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World!";
    }
    @PostMapping("/save")
    public String save(){
        return "Data saved ! ";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted ! ";
    }

}

