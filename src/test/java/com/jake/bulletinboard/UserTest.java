package com.jake.bulletinboard;

import com.jake.bulletinboard.entity.User;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Test
    public void createUser() {
        User user = new User(1, "john_doe");

        assertThat(user.getId()).isEqualTo(1);
        assertThat(user.getNickname()).isEqualTo("john_doe");
    }
}