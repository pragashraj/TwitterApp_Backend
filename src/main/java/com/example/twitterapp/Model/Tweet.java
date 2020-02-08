package com.example.twitterapp.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tweet {
    @Id
    private String username;
    private String tweet;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public Tweet(String username, String tweet) {
        this.username = username;
        this.tweet = tweet;
    }

    public Tweet() {
    }
}
