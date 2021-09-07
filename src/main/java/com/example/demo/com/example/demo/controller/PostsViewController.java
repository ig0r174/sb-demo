package com.example.demo.com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostsViewController {

    @Autowired
    private PostService postsService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        List<Post> posts = postsService.listAllPosts();
        model.addAttribute("posts", posts);
        model.addAttribute("appName", "Моё супер приложение");
        return "list";
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Здесь будет страница поста №" + id;
    }

}
