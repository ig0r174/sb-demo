package com.example.demo;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import com.example.demo.service.PostService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PostTest {

    @MockBean
    private PostRepository postRepository;

    @Autowired
    PostService postService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void createPostTest(){
        String postText = "test-post";
        Post post = postService.create("test-post");
        Mockito.verify(postRepository, Mockito.times(1)).save(post);
        Assertions.assertEquals(post.getText(), postText);
    }

    @Test
    public void postRedirectTest() throws Exception{
        mockMvc.perform(post("/new"))
                .andExpect(redirectedUrl("/"));
    }

}
