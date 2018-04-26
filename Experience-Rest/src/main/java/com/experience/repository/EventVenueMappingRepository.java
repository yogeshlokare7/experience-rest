package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.experience.model.EventVenueMapping;

@Repository
public interface EventVenueMappingRepository extends JpaRepository<EventVenueMapping, Serializable>{

}
