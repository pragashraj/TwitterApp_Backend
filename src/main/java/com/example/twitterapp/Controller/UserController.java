package com.example.twitterapp.Controller;

import com.example.twitterapp.Model.User;
import com.example.twitterapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("register")
    public void saveUser(@RequestBody User user){
        userRepository.save(user);

    }
}
