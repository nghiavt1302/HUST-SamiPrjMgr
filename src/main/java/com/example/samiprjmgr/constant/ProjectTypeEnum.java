package com.example.samiprjmgr.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProjectTypeEnum {
    DA1(0), DA2(1), DATK(2), BCTT(3), DATN(4);
    private final int value;
}
