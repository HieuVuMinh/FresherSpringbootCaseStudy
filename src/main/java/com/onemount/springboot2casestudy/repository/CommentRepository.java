package com.onemount.springboot2casestudy.repository;

import com.onemount.springboot2casestudy.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Iterable<Comment> findAllByBlogId(Long id);
}
