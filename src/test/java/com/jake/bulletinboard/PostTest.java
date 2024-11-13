package com.jake.bulletinboard;

import com.jake.bulletinboard.entity.Post;
import com.jake.bulletinboard.entity.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class PostTest {

    @Test
    public void createPost() {
        User user = new User(1, "john_doe");

        Post post = new Post(1, "Title", "Content", LocalDateTime.now(), user.getNickname());

        assertThat(post.getId()).isEqualTo(1);
        assertThat(post.getTitle()).isEqualTo("Title");
        assertThat(post.getContent()).isEqualTo("Content");
        assertThat(post.getNickname()).isEqualTo("john_doe");
    }
}