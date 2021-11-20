package com.onemount.springboot2casestudy.service.blogreaction;

import com.onemount.springboot2casestudy.model.Blog;
import com.onemount.springboot2casestudy.model.BlogReaction;
import com.onemount.springboot2casestudy.model.User;
import com.onemount.springboot2casestudy.service.GeneralService;

import java.util.Optional;

public interface BlogReactionService extends GeneralService<BlogReaction> {
    Optional<BlogReaction> findAllByUserAndByBlog(User user, Blog blog);

    Optional<BlogReaction> findByUserIdAndBlogId(Long userId, Long blogId);

    Iterable<BlogReaction> findAllByBlog(Blog blog);
}
