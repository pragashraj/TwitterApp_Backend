package com.example.twitterapp.Service;

import com.example.twitterapp.Model.Tweet;
import com.example.twitterapp.Repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {
    @Autowired
    TweetRepository tweetRepository;

    public TweetService(TweetRepository tweetRepository){
        this.tweetRepository=tweetRepository;
    }

    public List<Tweet> getAll(){
        return (List<Tweet>) tweetRepository.findAll();
    }
}
