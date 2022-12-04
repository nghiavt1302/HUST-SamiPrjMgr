package com.example.samiprjmgr.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
public class StudentEntity {
    @Id
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "full_name")
    private String fullName;

    private String programme;
    @Column(name = "class_name")
    private String className;

    private Integer k;

    private float cpa;

    private String phone;
    @Column(name = "user_id")
    private Integer userId;
}
