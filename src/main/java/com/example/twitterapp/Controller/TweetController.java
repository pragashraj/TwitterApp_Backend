package com.example.twitterapp.Controller;

import com.example.twitterapp.Model.Tweet;
import com.example.twitterapp.Repository.TweetRepository;
import com.example.twitterapp.Service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class TweetController {
    @Autowired
    TweetRepository tweetRepository;

    @Autowired
    TweetService tweetService;

    @PostMapping("posttweet")
    public void saveTweet(@RequestBody Tweet tweet){
        tweetRepository.save(tweet);
    }

    @GetMapping("getTweet")
    public List<Tweet> getAllTweet(){
        return tweetService.getAll();
    }
}
