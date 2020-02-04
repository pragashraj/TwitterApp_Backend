package com.example.twitterapp.Controller;

import com.example.twitterapp.Model.User;
import com.example.twitterapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("register")
    public String saveUser(@RequestParam User user){
        userRepository.save(user);
        return "Success";
    }
}
