package com.example.samiprjmgr.model.entity;

import com.example.samiprjmgr.constant.ProjectTypeEnum;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "application")
@Data
public class ApplicationEntity {
    @Id
    @Column(name = "form_id")
    private String formId;
    @Column(name = "project_type")
    private ProjectTypeEnum projectType;

    private String term;

    private String orientation;

    private String opt1;

    private String opt2;

    private String opt3;
    @Column(name = "submit_time")
    private Timestamp submitTime;
    @Column(name = "student_id")
    private Integer studentId;
}
