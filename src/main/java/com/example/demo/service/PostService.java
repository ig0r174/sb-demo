package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>() {{
        add(new Post(0, "Байден встретился с Зеленским, санкции США из-за России. Главное за ночь", new Date(1630566866000L)));
        add(new Post(  1, "«Вектор» сообщил о планах перейти на производство «ЭпиВакКороны-Н»", new Date(1630566766000L)));
        add(new Post(2, "За год бесплатного банкротства без суда добились 2,4 тыс. россиян", new Date(1630566666000L)));
    }};

    public List<Post> listAllPosts()
    {
       return posts;
    }

    public void create(String text) {
        posts.add(new Post(posts., text, new Date()));
    }

}
