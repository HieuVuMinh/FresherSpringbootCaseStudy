package com.onemount.springboot2casestudy.service.blog;

import com.onemount.springboot2casestudy.model.Blog;
import com.onemount.springboot2casestudy.model.User;
import com.onemount.springboot2casestudy.model.dto.DetailedBlog;
import com.onemount.springboot2casestudy.model.dto.TopBlog;
import com.onemount.springboot2casestudy.service.GeneralService;

public interface BlogService extends GeneralService<Blog> {
    Iterable<Blog> findAllByUser(User user);

    Iterable<DetailedBlog> findAllDetailedBlogs(int limit);

    Iterable<DetailedBlog> findAllDetailedBlogsByUserId(Long userId, int limit);

    Iterable<TopBlog> findTopBlogs();

    Iterable<Blog> findAllByContentContains(String keyword);
}
