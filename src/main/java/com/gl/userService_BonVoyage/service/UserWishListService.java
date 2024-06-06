package com.gl.userService_BonVoyage.service;

import com.gl.userService_BonVoyage.entity.UserWishList;
import com.gl.userService_BonVoyage.repository.UserWishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserWishListService {
    @Autowired
    private UserWishListRepository userWishListRepository;

    public UserWishList addUserWishList(UserWishList userWishList){
        return userWishListRepository.save(userWishList);
    }
}
