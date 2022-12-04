package com.example.samiprjmgr.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleEnum {
    ADMIN(0), STUDENT(1), TEACHER(2);
    private final int value;
}
