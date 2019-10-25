package com.demo.micro8.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Integer save(User user) {
        try {
            userRepository.save(user);
            return 1;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public Page<User> findAllByUserNameContains(String userName, Pageable pageable){
        return userRepository.findAllByUserNameContains(userName, PageRequest.of(pageable.getPageNumber(),pageable.getPageSize()));
    }
}
