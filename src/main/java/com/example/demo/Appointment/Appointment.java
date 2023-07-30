package com.example.demo.Appointment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Appointment 
{
	@Id
	private Long ActivityId;
	private Long CustomerId;
	private Long AnimatorId;
	private String DateHour;
	
	public Appointment() {
		
	}
	
	public Appointment(Long activityId,
			Long customerId,
			Long animatorId,
			String dateHour) 
	{
		ActivityId = activityId;
		CustomerId = customerId;
		AnimatorId = animatorId;
		DateHour = dateHour;
	}
	
	public Appointment(Long customerId,
			Long animatorId,
			String dateHour) {
		CustomerId = customerId;
		AnimatorId = animatorId;
		DateHour = dateHour;
	}
	
	
	public Long getActivityId() {
		return ActivityId;
	}

	public void setActivityId(Long activityId) {
		ActivityId = activityId;
	}

	public Long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Long customerId) {
		CustomerId = customerId;
	}

	public Long getAnimatorId() {
		return AnimatorId;
	}

	public void setAnimatorId(Long animatorId) {
		AnimatorId = animatorId;
	}

	public String getDateHour() {
		return DateHour;
	}

	public void setDateHour(String dateHour) {
		DateHour = dateHour;
	}

	@Override
	public String toString() {
		return "Appointment {" + "ActivityId=" + ActivityId +
				", CustomerId=" + CustomerId +
				", AnimatorId=" + AnimatorId +
				", DateHour=" + DateHour + "}";
	}
	
	
	
}
