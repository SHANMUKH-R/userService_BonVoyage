package com.gl.userService_BonVoyage.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="userWishList")
public class UserWishList {

    @Id
    private String wishListId;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
