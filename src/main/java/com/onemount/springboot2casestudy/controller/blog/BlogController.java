package com.onemount.springboot2casestudy.controller.blog;

import com.onemount.springboot2casestudy.service.blog.BlogService;
import com.onemount.springboot2casestudy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView showIndex() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("blogs", blogService.findAll());
        return modelAndView;
    }

    @GetMapping("/wall/{username}")
    public ModelAndView showPersonalWall(@PathVariable String username) {
        return new ModelAndView("personal","user",userService.findByUsername(username).get());
    }
}
