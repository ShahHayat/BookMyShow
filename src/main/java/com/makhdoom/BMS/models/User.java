package com.makhdoom.BMS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class User extends BaseModel {

    @Column(name = "username", nullable = false)
    private String userName;
    private String email;
    private String password;
    private String mobileNumber;
}
