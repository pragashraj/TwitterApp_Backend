package com.example.twitterapp.Controller;

import com.example.twitterapp.Model.Tweet;
import com.example.twitterapp.Repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TweetController {
    @Autowired
    TweetRepository tweetRepository;

    @PostMapping("posttweet")
    public void saveTweet(@RequestBody Tweet tweet){
        tweetRepository.save(tweet);
    }
}
