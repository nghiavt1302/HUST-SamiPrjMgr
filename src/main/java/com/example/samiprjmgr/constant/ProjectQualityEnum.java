package com.example.samiprjmgr.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProjectQualityEnum {
    QUALIFIED(1), UNQUALIFIED(0);
    private final int value;
}
