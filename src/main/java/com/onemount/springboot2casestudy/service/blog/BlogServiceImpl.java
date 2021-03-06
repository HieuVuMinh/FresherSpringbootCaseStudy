package com.onemount.springboot2casestudy.service.blog;

import com.onemount.springboot2casestudy.model.Blog;
import com.onemount.springboot2casestudy.model.User;
import com.onemount.springboot2casestudy.model.dto.DetailedBlog;
import com.onemount.springboot2casestudy.model.dto.TopBlog;
import com.onemount.springboot2casestudy.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void deleteById(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Iterable<Blog> findAllByUser(User user) {
        return blogRepository.findAllByUser(user);
    }

    @Override
    public Iterable<DetailedBlog> findAllDetailedBlogs(int limit) {
        return blogRepository.findAllDetailedBlogs(limit);
    }

    @Override
    public Iterable<DetailedBlog> findAllDetailedBlogsByUserId(Long userId, int limit) {
        return blogRepository.findAllDetailedBlogsByUserId(userId, limit);
    }

    @Override
    public Iterable<TopBlog> findTopBlogs() {
        return blogRepository.findTopBlogs();
    }

    @Override
    public Iterable<Blog> findAllByContentContains(String keyword) {
        keyword = "%" + keyword + "%";
        return blogRepository.findAllByContentContains(keyword);
    }
}
