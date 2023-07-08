package com.example.restfulwebservices.post;

import com.example.restfulwebservices.user.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class PostDaoService {
    private static List<Post> postList = new ArrayList<>();

    static {
        postList.add(new Post(1, "user 1 first post", 1));
        postList.add(new Post(2, "user 1 second post", 1));
        postList.add(new Post(1, "user 2 first post", 2));
    }

    public List<Post> findAll() {
        return postList;
    }

    public Post findOne(int id) {
        for (Post post : postList) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public Post save(Post post, int userId) {
        if (post.getId() == null) {
            post.setId(postList.size() + 1);
        }
        post.setAuthorId(userId);
        postList.add(post);
        return post;
    }

    public List<Post> findAllByUserId(int userId) {
        List<Post> result = new ArrayList<>();
        for (Post post : postList) {
            if (post.getAuthorId() == userId)
                result.add(post);
        }
        return result;
    }
}
