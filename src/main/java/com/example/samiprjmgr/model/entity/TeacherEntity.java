package com.example.samiprjmgr.model.entity;

import com.example.samiprjmgr.constant.DepartmentEnum;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teacher")
@Data
public class TeacherEntity {
    @Id
    @Column(name = "teacher_id")
    private String teacherId;
    @Column(name = "full_name")
    private String fullName;

    private String phone;

    private DepartmentEnum department;

    private String expertise;

    private Integer quota;
    @Column(name = "user_id")
    private Integer userId;
}
