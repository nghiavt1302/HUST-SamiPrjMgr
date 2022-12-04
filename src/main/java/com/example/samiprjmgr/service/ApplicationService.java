package com.example.samiprjmgr.service;

import com.example.samiprjmgr.constant.ProjectTypeEnum;
import com.example.samiprjmgr.model.entity.ApplicationEntity;

import java.util.List;

public interface ApplicationService {
    void sendApplication(ApplicationEntity application);

    List<ApplicationEntity> getStudentAppListByTermAndType(Integer student_id, String term, ProjectTypeEnum type);
}
