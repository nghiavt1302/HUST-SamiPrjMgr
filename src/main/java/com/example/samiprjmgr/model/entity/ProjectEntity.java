package com.example.samiprjmgr.model.entity;

import com.example.samiprjmgr.constant.ProjectQualityEnum;
import com.example.samiprjmgr.constant.ProjectTypeEnum;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "project")
@Data
public class ProjectEntity {
    @Id
    private String project_id;

    private String title;

    private String link;

    private ProjectQualityEnum status;

    private String term;

    private ProjectTypeEnum project_type;

    private Integer student_id;

    private float instructor_grade;

    private float reviewer_grade;

    private float committee_grade;

    private String keywords;
}
