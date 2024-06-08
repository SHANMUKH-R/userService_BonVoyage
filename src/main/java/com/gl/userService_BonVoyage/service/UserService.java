package com.gl.userService_BonVoyage.service;

import com.gl.userService_BonVoyage.dto.UserDTO;
import com.gl.userService_BonVoyage.entity.User;
import com.gl.userService_BonVoyage.repository.UserRepository;
import com.gl.userService_BonVoyage.util.Mapper;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    public UserDTO addUser(UserDTO userDTO){
        User user = Mapper.mapToUserEntity(userDTO);
//        user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
        return Mapper.mapToUserDto(userRepository.save(user));
    }
}
