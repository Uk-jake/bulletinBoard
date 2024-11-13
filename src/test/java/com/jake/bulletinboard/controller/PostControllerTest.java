package com.jake.bulletinboard.controller;

import com.jake.bulletinboard.entity.User;
import com.jake.bulletinboard.repository.PostRepository;
import com.jake.bulletinboard.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void createPost() throws Exception {
        // 테스트에서 User 데이터를 저장함
        User user = new User();
        user.setNickname("john_doe");
        User savedUser = userRepository.save(user);

        // Post 요청
        mockMvc.perform(post("/posts")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\": \"Title\", \"content\": \"Content\", " +
                                "\"user\": { \"id\": " + savedUser.getId() + " }, \"time\": \"2024-11-13T10:00:00\"}"))
                .andExpect(status().isOk());
    }

    @Test
    public void getAllPosts() throws Exception {
        mockMvc.perform(get("/posts"))
                .andExpect(status().isOk());
    }
}