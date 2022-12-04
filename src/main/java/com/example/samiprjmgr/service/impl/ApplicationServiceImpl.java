package com.example.samiprjmgr.service.impl;

import com.example.samiprjmgr.constant.ProjectTypeEnum;
import com.example.samiprjmgr.model.entity.ApplicationEntity;
import com.example.samiprjmgr.repository.ApplicationRepository;
import com.example.samiprjmgr.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    ApplicationRepository applicationRepository;

    @Override
    public void sendApplication(ApplicationEntity application) {
        applicationRepository.save(application);
    }

    @Override
    public List<ApplicationEntity> getStudentAppListByTermAndType(Integer student_id,
                                                                  String term,
                                                                  ProjectTypeEnum type) {
        return applicationRepository.findAllByStudentIdAndTermAndProjectType(student_id, term, type);
    }
}
