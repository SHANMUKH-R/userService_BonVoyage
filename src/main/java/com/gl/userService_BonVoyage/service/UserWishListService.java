package com.gl.userService_BonVoyage.service;

import com.gl.userService_BonVoyage.dto.UserWishListDTO;
import com.gl.userService_BonVoyage.entity.User;
import com.gl.userService_BonVoyage.entity.UserWishList;
import com.gl.userService_BonVoyage.exception.ResourceNotFoundException;
import com.gl.userService_BonVoyage.repository.UserRepository;
import com.gl.userService_BonVoyage.repository.UserWishListRepository;
import com.gl.userService_BonVoyage.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserWishListService {
    @Autowired
    private UserWishListRepository userWishListRepository;
    @Autowired
    UserRepository userRepository;

    public UserWishListDTO addUserWishList(UserWishListDTO userWishListDTO, String userId){


        UserWishList userWishList = Mapper.mapToUserWishList(userWishListDTO);
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User","Id",userId.toString()));
        userWishList.setUser(user);
        UserWishList userWishList1 = userWishListRepository.save(userWishList);
        userWishList1.setWishListId(user.getUserId());
        return Mapper.mapToUserWishListDTO(userWishListRepository.save(userWishList));
    }
}
