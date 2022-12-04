package com.example.samiprjmgr.repository;

import com.example.samiprjmgr.constant.DepartmentEnum;
import com.example.samiprjmgr.model.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, String> {
    List<TeacherEntity> findAllByTeacherId(String id);
    List<TeacherEntity> findAllByFullName(String name);
    List<TeacherEntity> findAllByDepartment(DepartmentEnum department);
}
