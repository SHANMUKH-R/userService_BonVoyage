package com.gl.userService_BonVoyage.repository;

import com.gl.userService_BonVoyage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    @Query("select s from users as s where s.userEmail =:email")
    User findByUserEmail(@Param("email") String email);

    @Query("SELECT MAX(u.userId) FROM User u")
    String findMaxUserId();
}
