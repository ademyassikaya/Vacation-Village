package com.example.demo.MassActivity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table
public class MassActivity 
{

	@Id
	@SequenceGenerator(
			name="massActivity_sequence",
			sequenceName="massActivity_sequence",
			allocationSize=1)
	@GeneratedValue(
			strategy= GenerationType.SEQUENCE,
			generator="massActivity_sequence")

	public Long ActivityId;
	public String ActivityName;
	public String Date;
	public String Hour;
	public String ActivityType;
	public String TypeActivity;
	public String Internet;
	public int Capacity;
	public Long AnimatorId;
	
	public MassActivity() {
	}
	
	public MassActivity(Long activityId,
			String activityName,
			String date,
			String hour,
			String activityType,
			String typeActivity,
			String internet,
			int capacity,
			Long animatorId) 
	{
		this.ActivityId = activityId;
		this.ActivityName = activityName;
		this.Date = date;
		this.Hour = hour;
		this.ActivityType = activityType;
		this.TypeActivity = typeActivity;
		this.Internet = internet;
		this.Capacity = capacity;
		this.AnimatorId = animatorId;
	}
	
	public MassActivity(String activityName,
			String date,
			String hour,
			String activityType,
			String typeActivity,
			String internet,
			int capacity,
			Long animatorId) {
		this.ActivityName = activityName;
		this.Date = date;
		this.Hour = hour;
		this.ActivityType = activityType;
		this.TypeActivity = typeActivity;
		this.Internet = internet;
		this.Capacity = capacity;
		this.AnimatorId = animatorId;
	}
	
	public Long getActivityId() {
		return ActivityId;
	}

	public void setActivityId(Long activityId) {
		ActivityId = activityId;
	}

	public String getActivityName() {
		return ActivityName;
	}

	public void setActivityName(String activityName) {
		ActivityName = activityName;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getHour() {
		return Hour;
	}

	public void setHour(String hour) {
		Hour = hour;
	}

	public String getActivityType() {
		return ActivityType;
	}

	public void setActivityType(String activityType) {
		ActivityType = activityType;
	}
	
	public String getTypeActivity() {
		return TypeActivity;
	}

	public void setTypeActivity(String typeActivity) {
		TypeActivity = typeActivity;
	}

	public String getInternet() {
		return Internet;
	}

	public void setInternet(String internet) {
		Internet = internet;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public Long getAnimatorId() {
		return AnimatorId;
	}

	public void setAnimatorId(Long animatorId) {
		AnimatorId = animatorId;
	}

	@Override
	public String toString() {
		return "MassActivity{"+ "ActivityId=" + ActivityId +
				", ActivityName=" + ActivityName +
				", Date=" + Date +
				", Hour=" + Hour +
				", ActivityType=" + ActivityType +
				", TypeActivity=" + TypeActivity +
				", Internet=" + Internet +
				", Capacity=" + Capacity +
				", AnimatorId=" + AnimatorId + "}";
	}

	
}
