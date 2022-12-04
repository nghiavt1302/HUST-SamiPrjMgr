package com.example.samiprjmgr.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DepartmentEnum {
    BMTCB(0), BMTT(1), BMTUD(2);
    private final int value;
}
