package com.example.samiprjmgr.controller;

import com.example.samiprjmgr.constant.ProjectTypeEnum;
import com.example.samiprjmgr.model.entity.ApplicationEntity;
import com.example.samiprjmgr.service.ApplicationService;
import com.example.samiprjmgr.model.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;


@RestController
@RequestMapping("/application")
public class ApplicationController {
    @Autowired
    ApplicationService applicationService;

    @PostMapping("/add")
    public ApplicationResponse addApplication(@RequestBody ApplicationEntity app){
        ApplicationResponse response = new ApplicationResponse(false, null, null);
        Integer studentId = app.getStudentId();
        String thisTerm = app.getTerm();
        ProjectTypeEnum type = app.getProjectType();
        List<ApplicationEntity> studentAppListThisTermAndType = applicationService
                .getStudentAppListByTermAndType(studentId, thisTerm, type);
        if (studentAppListThisTermAndType.isEmpty()){
            Timestamp submit = new Timestamp(System.currentTimeMillis());
            app.setSubmitTime(submit);
            String appId = app.getStudentId()
                    + "."
                    +  app.getTerm()
                    + "."
                    + app.getProjectType();
            app.setFormId(appId);
            applicationService.sendApplication(app);
            response.setSuccess(true);
            response.setMessage("Gui dang ki thanh cong.");
            response.setData(app);
        }else {
            response.setMessage("Ban da dang ki loai do an nay roi.");
        }
        return response;
    }
}
