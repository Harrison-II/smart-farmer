package com.Final.Year.service;

import com.Final.Year.models.PostModel;
import com.Final.Year.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;


    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostModel savePost(PostModel post) {
        return postRepository.save(post);
    }

    public PostModel getPost(long id) {
        return postRepository.findById(id).get();
    }

    public List<PostModel> getAllPosts() {
        return postRepository.findAll();
    }

    public PostModel updatePost(PostModel post) {
        return postRepository.save(post);
    }

    public void deletePostById(long id) {
        postRepository.deleteById(id);
    }

    public void deleteAllPosts() {
        postRepository.deleteAll();
    }
}
