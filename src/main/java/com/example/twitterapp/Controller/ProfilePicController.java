package com.example.twitterapp.Controller;

import com.example.twitterapp.Model.ProfilePic;
import com.example.twitterapp.Repository.ProfilePicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

@RestController
@RequestMapping("/api/")
public class ProfilePicController {
    @Autowired
    ProfilePicRepository profilePicRepository;

    @PostMapping("postImage")
    public void saveImage(@RequestParam("image") MultipartFile file,@RequestParam("name") String username){
        try {
            if (file == null) {
                System.out.println("null file");
            }else
            {
                byte[] imageBytes = file.getBytes();
                ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
                BufferedImage bImage2 = ImageIO.read(bis);
                String path="C:\\Users\\Home\\Documents\\Twitter App\\PofilePics\\"+username+".jpg";
                ImageIO.write(bImage2, "jpg", new File(path) );
                ProfilePic profilePic=new ProfilePic(username,path);
                profilePicRepository.save(profilePic);
            }
        }catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

    @GetMapping(value="getPicture",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPicture(@RequestParam("name") String username)throws IOException{
        File file=new File("C:\\Users\\Home\\Documents\\Twitter App\\PofilePics\\amal.jpg");
        byte[] bytesArray = new byte[(int) file.length()];
        FileInputStream fis = new FileInputStream(file);
        fis.read(bytesArray);
        fis.close();
        return bytesArray;
    }
}
