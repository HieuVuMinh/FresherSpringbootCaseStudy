package com.onemount.springboot2casestudy.model.dto;

public interface TopBlog {
    Long getId();
    String getContent();
    String getUsername();
    String getFullName();
    int getReactionCount();
    int getCommentCount();
    int getPopularity();
}
