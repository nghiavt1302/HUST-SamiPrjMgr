package com.example.samiprjmgr.model.entity;

import com.example.samiprjmgr.constant.RoleEnum;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class UserEntity {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String email;

    private String password;

    private RoleEnum role;

    private Boolean status;
}
