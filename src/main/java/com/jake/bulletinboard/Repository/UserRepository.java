package com.jake.bulletinboard.Repository;

import com.jake.bulletinboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}