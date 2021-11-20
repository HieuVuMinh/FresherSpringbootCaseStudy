package com.onemount.springboot2casestudy.controller.comment;

import com.onemount.springboot2casestudy.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    BlogService blogService;
}



