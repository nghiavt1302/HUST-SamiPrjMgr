package com.example.samiprjmgr.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "committee")
@Data
public class CommitteeEntity {
    @Id
    private String comm_id;

    private String president_id;

    private String secretary_id;

    private String member_id;
}
