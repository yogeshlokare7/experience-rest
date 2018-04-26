package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.experience.model.EventMaster;

@Repository
public interface EventMasterRepository extends JpaRepository<EventMaster, Serializable>{

}
