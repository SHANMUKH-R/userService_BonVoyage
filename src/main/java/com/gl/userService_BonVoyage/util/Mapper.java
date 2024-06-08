package com.gl.userService_BonVoyage.util;

import com.gl.userService_BonVoyage.UserServiceBonVoyageApplication;
import com.gl.userService_BonVoyage.dto.UserDTO;
import com.gl.userService_BonVoyage.dto.UserWishListDTO;
import com.gl.userService_BonVoyage.entity.User;
import com.gl.userService_BonVoyage.entity.UserWishList;

public class Mapper {

    // map the user entity to user dto
    public static UserDTO mapToUserDto(User user) {
        return UserServiceBonVoyageApplication.modelMapper().map(user, UserDTO.class);
    }

    // map the user dto to user entity
    public static User mapToUserEntity(UserDTO userDTO) {
        return UserServiceBonVoyageApplication.modelMapper().map(userDTO, User.class);
    }

    public static UserWishListDTO mapToUserWishListDTO(UserWishList userWishList) {
        return UserServiceBonVoyageApplication.modelMapper().map(userWishList, UserWishListDTO.class);
    }

    // map the equipment dto to equipment entity
    public static UserWishList mapToUserWishList(UserWishListDTO userWishListDTO) {
        return UserServiceBonVoyageApplication.modelMapper().map(userWishListDTO, UserWishList.class);
    }
}
