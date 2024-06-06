package com.gl.userService_BonVoyage.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(generator = "custom-id-generator")
    @GenericGenerator(name = "custom-id-generator", strategy = "com.gl.userService_BonVoyage.util.CustomIdGenerator")
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
}
