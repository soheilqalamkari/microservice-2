package com.demo.micro8.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {


    Integer save(User user);

    Page<User> findAllByUserNameContains(String userName, Pageable pageable);

}
