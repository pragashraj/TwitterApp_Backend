package com.example.twitterapp.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ProfilePic {
    @Id
    private String username;
    private String imagepath;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public ProfilePic(String username, String imagepath) {
        this.username = username;
        this.imagepath = imagepath;
    }

    public ProfilePic() {
    }
}
