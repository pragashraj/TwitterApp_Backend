package com.example.twitterapp.Repository;

import com.example.twitterapp.Model.Tweet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends CrudRepository<Tweet,String> {
}
