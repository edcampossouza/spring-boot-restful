package com.example.restfulwebservices.post;

import com.example.restfulwebservices.user.User;

import java.util.Date;

public class Post {
    private Integer id;
    private String text;
    private Date createdAt;
    private Integer authorId;

    public Post(Integer id, String text, Integer authorId) {
        this.id = id;
        this.text = text;
        this.authorId = authorId;
        this.createdAt = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }


}
