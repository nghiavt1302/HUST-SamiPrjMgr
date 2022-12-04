package com.example.samiprjmgr.repository;

import com.example.samiprjmgr.model.entity.CommitteeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommitteeRepository extends JpaRepository<CommitteeEntity, String> {
}
