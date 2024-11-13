package com.jake.bulletinboard.Repository;


import com.jake.bulletinboard.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
