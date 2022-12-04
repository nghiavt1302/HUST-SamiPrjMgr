package com.example.samiprjmgr.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AssignStatusEnum {
    UNASSIGNED(0), ASSIGNED(1), ACCEPTED(2);
    private final int value;
}
