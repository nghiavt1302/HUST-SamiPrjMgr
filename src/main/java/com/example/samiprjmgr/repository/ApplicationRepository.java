package com.example.samiprjmgr.repository;

import com.example.samiprjmgr.constant.ProjectTypeEnum;
import com.example.samiprjmgr.model.entity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationEntity, String> {
    List<ApplicationEntity> findAllByStudentIdAndTermAndProjectType(Integer id, String term, ProjectTypeEnum type);
}
