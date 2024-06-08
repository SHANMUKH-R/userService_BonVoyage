package com.gl.userService_BonVoyage.dto;


import com.gl.userService_BonVoyage.entity.UserWishList;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {


    private String userId;
    private String userName;

    @Email
    private String userEmail;
    private Long userPhone;
    private String userPassword;
    private String userAddress;
    private String userRole;
    private List<UserWishListDTO> userWishListDTO;
}
