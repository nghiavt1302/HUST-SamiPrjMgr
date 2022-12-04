package com.example.samiprjmgr.model.response;

import com.example.samiprjmgr.model.entity.ApplicationEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ApplicationResponse {
    private boolean success;
    private String message;
    private ApplicationEntity data;
}
