package com.onemount.springboot2casestudy.service.blogreaction;

import com.onemount.springboot2casestudy.model.Blog;
import com.onemount.springboot2casestudy.model.BlogReaction;
import com.onemount.springboot2casestudy.model.User;
import com.onemount.springboot2casestudy.repository.BlogReactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogReactionServiceImpl implements BlogReactionService{
    @Autowired
    private BlogReactionRepository blogReactionRepository;

    @Override
    public Iterable<BlogReaction> findAll() {
        return blogReactionRepository.findAll();
    }

    @Override
    public Optional<BlogReaction> findById(Long id) {
        return blogReactionRepository.findById(id);
    }

    @Override
    public BlogReaction save(BlogReaction blogReaction) {
        return blogReactionRepository.save(blogReaction);
    }

    @Override
    public void deleteById(Long id) {
        blogReactionRepository.deleteById(id);
    }

    @Override
    public Optional<BlogReaction> findAllByUserAndByBlog(User user, Blog blog) {
        return blogReactionRepository.findAllByUserAndByBlog(user, blog);
    }

    @Override
    public Optional<BlogReaction> findByUserIdAndBlogId(Long userId, Long blogId) {
        return blogReactionRepository.findByUserIdAndBlogId(userId, blogId);
    }

    @Override
    public Iterable<BlogReaction> findAllByBlog(Blog blog) {
        return blogReactionRepository.findAllByBlog(blog);
    }
}
