package com.onemount.springboot2casestudy.controller.comment;

import com.onemount.springboot2casestudy.model.Comment;
import com.onemount.springboot2casestudy.model.User;
import com.onemount.springboot2casestudy.service.comment.CommentService;
import com.onemount.springboot2casestudy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/comment-blog")
public class CommentRestController {

    @Autowired
    private UserService userService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/{id}")
    public ResponseEntity<Iterable<Comment>> showListComment(@PathVariable Long id){
        return new ResponseEntity<>(commentService.findAllByBlogId(id), HttpStatus.OK);
    }

    @GetMapping("/comment/{id}")
    public ResponseEntity<Comment> findCommentById(@PathVariable Long id){
        Optional<Comment> commentOptional = commentService.findById(id);
        if (!commentOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(commentOptional.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Comment> saveComment(@RequestBody Comment comment){
        Object loginUser = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = null;
        if (loginUser instanceof UserDetails) {
            String loginUsername = ((UserDetails) loginUser).getUsername();
            user = userService.findByUsername(loginUsername).get();
        }
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        comment.setUser(user);
        comment.setDate(new Date());
        return new ResponseEntity<>(commentService.save(comment), HttpStatus.CREATED);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Comment> daleteComment(@PathVariable Long id){
        Optional<Comment> commentOptional = commentService.findById(id);
        if (!commentOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        commentService.deleteById(commentOptional.get().getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
