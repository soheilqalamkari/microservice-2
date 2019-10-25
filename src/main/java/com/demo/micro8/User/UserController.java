package com.demo.micro8.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public ResponseEntity<Page<?>> getAll(@RequestBody User user, @RequestParam int page, @RequestParam int size){
        Page<User> list;
        list = userService.findAllByUserNameContains(user.getUserName(),PageRequest.of(page, size));
        return new ResponseEntity<>(list, HttpStatus.CREATED);
    }
}