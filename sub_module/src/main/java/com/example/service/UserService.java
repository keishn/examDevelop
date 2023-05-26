package com.example.service;

import com.example.model.UserDTO;
import com.example.model.UserEntity;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userDTO.getName());
        userRepository.save(userEntity);
    }

}
