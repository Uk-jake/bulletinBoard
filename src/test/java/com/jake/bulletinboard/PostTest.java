package com.jake.bulletinboard;

import com.jake.bulletinboard.entity.Post;
import com.jake.bulletinboard.entity.User;
import com.jake.bulletinboard.repository.PostRepository;
import com.jake.bulletinboard.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PostTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Test
    public void createPost() {
        // 먼저 User 객체를 데이터베이스에 저장해야 함
        User user = new User();
        user.setNickname("john_doe");
        User savedUser = userRepository.save(user);

        // 저장된 User 객체를 사용해 Post 객체를 생성
        Post post = new Post();
        post.setTitle("Title");
        post.setContent("Content");
        post.setTime(LocalDateTime.now());
        post.setUser(savedUser);  // User 객체 설정

        Post savedPost = postRepository.save(post);

        // 검증
        assertThat(savedPost.getId()).isNotNull();
        assertThat(savedPost.getTitle()).isEqualTo("Title");
        assertThat(savedPost.getContent()).isEqualTo("Content");
        assertThat(savedPost.getUser().getNickname()).isEqualTo("john_doe");
    }
}