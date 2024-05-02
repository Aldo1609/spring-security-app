package com.aldob.security.services;

import com.aldob.security.dto.LoginDTO;
import com.aldob.security.dto.ResponseDTO;
import com.aldob.security.entities.UserEntity;

import java.util.HashMap;

public interface AuthService {

    public HashMap<String, String> login(LoginDTO login) throws Exception;

    public ResponseDTO register(UserEntity user) throws Exception;

}
