package com.aldob.security.services;

import com.aldob.security.entities.UserEntity;

import java.util.List;

public interface UserService {

    public List<UserEntity> findAllUsers();

}
