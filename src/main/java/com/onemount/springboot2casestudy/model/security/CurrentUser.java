package com.onemount.springboot2casestudy.model.security;

import com.onemount.springboot2casestudy.model.User;
import com.onemount.springboot2casestudy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class CurrentUser {
    @Autowired
    private static UserService userService;

    public static User get() {
        Object loginUser = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = null;
        if (loginUser instanceof UserDetails) {
            String loginUsername = ((UserDetails) loginUser).getUsername();
            user = userService.findByUsername(loginUsername).get();
        }
        return user;
    }
}
