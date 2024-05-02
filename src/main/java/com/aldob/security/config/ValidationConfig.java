package com.aldob.security.config;

import com.aldob.security.validations.UserValidation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidationConfig {

    @Bean
    public UserValidation userValidation(){
        return new UserValidation();
    }

}
