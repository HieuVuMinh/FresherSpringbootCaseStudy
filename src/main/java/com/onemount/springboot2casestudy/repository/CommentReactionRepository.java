package com.onemount.springboot2casestudy.repository;

import com.onemount.springboot2casestudy.model.CommentReaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentReactionRepository extends JpaRepository<CommentReaction, Long> {

}
