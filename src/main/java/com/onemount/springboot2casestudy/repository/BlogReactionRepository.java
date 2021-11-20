package com.onemount.springboot2casestudy.repository;

import com.onemount.springboot2casestudy.model.Blog;
import com.onemount.springboot2casestudy.model.BlogReaction;
import com.onemount.springboot2casestudy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogReactionRepository extends JpaRepository<BlogReaction, Long> {
    @Query(value = "SELECT b FROM BlogReaction b WHERE b.user = ?1 AND b.blog = ?2")
    Optional<BlogReaction> findAllByUserAndByBlog(User user, Blog blog);

    @Query(value = "SELECT b FROM BlogReaction b WHERE b.user.id = ?1 AND b.blog.id = ?2")
    Optional<BlogReaction> findByUserIdAndBlogId(Long userId, Long blogId);

    Iterable<BlogReaction> findAllByBlog(Blog blog);
}
