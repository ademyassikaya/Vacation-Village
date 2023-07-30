package com.example.demo.EmergencyInfo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EmergencyInfoRepository 
extends JpaRepository<EmergencyInfo, Long>
{
	@Query("SELECT E FROM EmergencyInfo E WHERE E.ActivityId = ?1")
    Optional<EmergencyInfo> getInfoByActivityId(Long activityId);
}
