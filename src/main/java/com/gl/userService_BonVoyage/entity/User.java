package com.gl.userService_BonVoyage.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="users")
public class User {
    @Id
    @Column(unique = true,nullable = false)
    private String userId;

    @Column(unique = true,nullable = false)
    private String userName;

    @Email
    @Column(unique = true, nullable = false)
    private String userEmail;

    @Column(unique = true,nullable = false)
    private Long userPhone;

    @Column(nullable = false)
    private String userPassword;
    @Column(nullable = false)
    private String userAddress;
    @Column(nullable = false)
    private String userRole;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserWishList> userWishList;
}
