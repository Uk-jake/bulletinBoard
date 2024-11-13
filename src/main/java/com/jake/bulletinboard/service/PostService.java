package com.jake.bulletinboard.service;

import com.jake.bulletinboard.entity.Post;
import com.jake.bulletinboard.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 게시글 작성
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    // 게시글 전체 조회
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}