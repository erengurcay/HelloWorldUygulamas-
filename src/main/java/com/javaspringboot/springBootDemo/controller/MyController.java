package com.javaspringboot.springBootDemo.controller;

import com.javaspringboot.springBootDemo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class MyController {

//    @GetMapping("/message/{m}")
//    public String getMyMessage(@PathVariable(name = "m", required = false) String message){
//       return "Your message is : " + message;
//   }
    @PostMapping("users")
    public User saveUser(@RequestBody User user){
        System.out.println("User saved!");
        user.setPassword("");
        return user;
    }
    @PostMapping("all-users")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All users saved!");
        users.forEach(user -> user.setPassword(""));
        return users;
    }


}
