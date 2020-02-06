package com.example.twitterapp.Repository;

import com.example.twitterapp.Model.ProfilePic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilePicRepository extends CrudRepository<ProfilePic,String> {
}
