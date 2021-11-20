package com.onemount.springboot2casestudy.service.user;

import com.onemount.springboot2casestudy.model.User;
import com.onemount.springboot2casestudy.model.dto.TopFriend;
import com.onemount.springboot2casestudy.service.GeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends GeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);

    User update(User user);

    Iterable<User> findAllByKeyword(String keyword);

    Iterable<TopFriend> findTopFriendsByUserId(Long userId);
}
