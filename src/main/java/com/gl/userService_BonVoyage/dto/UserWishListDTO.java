package com.gl.userService_BonVoyage.dto;


import com.gl.userService_BonVoyage.entity.User;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserWishListDTO {

    private String wishListId;
}
