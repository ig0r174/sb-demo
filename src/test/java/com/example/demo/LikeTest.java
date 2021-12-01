package com.example.demo;

import com.example.demo.model.Post;
import com.example.demo.service.LikesService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("/application-test.properties")
public class LikeTest {

    @Autowired
    LikesService likesService;

    @Test
    public void likeSetTest(){
        Post post = new Post(1L, "Likes test post", new Date());
        post.setLikes(2);
        Assert.assertEquals(java.util.Optional.ofNullable(post.getLikes()), java.util.Optional.of(2));
    }

    @Test
    public void likeDefaultTest(){
        Post post = new Post(1L, "Likes test post", new Date());
        Assert.assertEquals(java.util.Optional.ofNullable(post.getLikes()), java.util.Optional.of(0));
    }

}
