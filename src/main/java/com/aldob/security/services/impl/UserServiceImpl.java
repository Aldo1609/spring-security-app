package com.aldob.security.services.impl;

import com.aldob.security.entities.UserEntity;
import com.aldob.security.repository.UserRepository;
import com.aldob.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

}
