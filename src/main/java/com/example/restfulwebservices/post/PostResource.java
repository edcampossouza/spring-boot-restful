package com.example.restfulwebservices.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostResource {
    @Autowired
    private PostDaoService service;

    @GetMapping(path = "/users/{userId}/posts")
    public List<Post> getAllPostsByUserId(@PathVariable int userId) {
        return service.findAllByUserId(userId);
    }

    @PostMapping(path = "/users/{userId}/posts")
    public Post createPost(@PathVariable int userId, @RequestBody Post post) {
        Post createdPost = service.save(post, userId);
        return createdPost;
    }
}
