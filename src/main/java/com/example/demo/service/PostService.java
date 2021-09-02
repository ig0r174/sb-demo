package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class PostService {

    public static List<Post> listAllPosts()
    {

        List<Post> list = new ArrayList<>();
        list.add(new Post("Байден встретился с Зеленским, санкции США из-за России. Главное за ночь"));
        list.add(new Post("«Вектор» сообщил о планах перейти на производство «ЭпиВакКороны-Н»"));
        list.add(new Post("За год бесплатного банкротства без суда добились 2,4 тыс. россиян"));

        return list;

    }

}
