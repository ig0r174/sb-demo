package com.example.demo.model;

import java.util.Date;

public class Post {

    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate)
    {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes(){
        return likes;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setLikes(int value) {
        this.likes = value;
    }

    public Long getId(){
        return this.id;
    }

}
