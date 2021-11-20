package com.onemount.springboot2casestudy.repository;

import com.onemount.springboot2casestudy.model.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Long> {

}
