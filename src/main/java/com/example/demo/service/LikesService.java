package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;

public class LikesService {

    @Autowired
    private PostService postsService;

    public void like()
    {
        Post post = postsService.listAllPosts().get(postId.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }

}
