package com.gl.userService_BonVoyage.repository;

import com.gl.userService_BonVoyage.entity.UserWishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWishListRepository extends JpaRepository<UserWishList,String> {
}
