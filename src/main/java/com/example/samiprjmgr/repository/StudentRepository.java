package com.example.samiprjmgr.repository;

import com.example.samiprjmgr.model.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    List<StudentEntity> findAllByStudentId(Integer student_id);
    List<StudentEntity> findAllByFullName(String name);
    List<StudentEntity> findAllByClassName(String class_name);
    List<StudentEntity> findAllByProgramme(String prog);
    List<StudentEntity> findAllByK(Integer k);
}
