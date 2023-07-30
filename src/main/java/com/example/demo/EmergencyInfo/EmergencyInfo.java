package com.example.demo.EmergencyInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class EmergencyInfo 
{

	@Id
	@SequenceGenerator(
		name="emergencyInfo_sequence",
		sequenceName="emergencyInfo_sequence",
		allocationSize=1)
	@GeneratedValue(
		strategy= GenerationType.SEQUENCE,
		generator="emergencyInfo_sequence")
	
	private Long LockerNumber;
	private Long ActivityId;
	private String PhoneNumber;
	
	public EmergencyInfo() 
	{
	}

	public EmergencyInfo(Long lockerNumber,
			Long activityId,
			String phoneNumber) {
		this.LockerNumber = lockerNumber;
		this.ActivityId = activityId;
		this.PhoneNumber = phoneNumber;
	}

	public EmergencyInfo(Long activityId,
			String phoneNumber) {
		this.ActivityId = activityId;
		this.PhoneNumber = phoneNumber;
	}

	public Long getLockerNumber() {
		return LockerNumber;
	}

	public void setLockerNumber(Long lockerNumber) {
		LockerNumber = lockerNumber;
	}

	public Long getActivityId() {
		return ActivityId;
	}

	public void setActivityId(Long activityId) {
		ActivityId = activityId;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "EmergencyInfo {" +
			",LockerNumber=" + LockerNumber +
			", ActivityId=" + ActivityId +
			", PhoneNumber=" + PhoneNumber + "}";
	}
	
	
	
	
	
}
