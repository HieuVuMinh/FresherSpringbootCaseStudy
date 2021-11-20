package com.onemount.springboot2casestudy.service.comment;


import com.onemount.springboot2casestudy.model.Comment;
import com.onemount.springboot2casestudy.service.GeneralService;

public interface CommentService extends GeneralService<Comment> {
    Iterable<Comment> findAllByBlogId(Long id);
}
