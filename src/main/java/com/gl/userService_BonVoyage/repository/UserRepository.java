package com.gl.userService_BonVoyage.repository;

import com.gl.userService_BonVoyage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
