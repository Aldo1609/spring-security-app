package com.aldob.security.validations;

import com.aldob.security.dto.ResponseDTO;
import com.aldob.security.entities.UserEntity;

public class UserValidation {

    public ResponseDTO validate(UserEntity user){

        ResponseDTO response = new ResponseDTO();

        response.setNumOfErrors(0);

        if(user.getFirstName() == null || user.getFirstName().isEmpty()){
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("First name can't be null or empty.");
        }

        if(user.getLastName() == null || user.getLastName().isEmpty()){
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Last name can't be null or empty.");
        }

        if(user.getEmail() == null || user.getEmail().isEmpty() || !user.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")  ){
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Email can't be null or empty.");
        }

        if(user.getPassword() == null || user.getPassword().isEmpty() || !user.getPassword().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,16}$")  ){
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Password can't be null or empty.");
        }

        return response;
    }

}
