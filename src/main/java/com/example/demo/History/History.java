package com.example.demo.History;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="history_view")
public class History 
{
	 @Id
	 @SequenceGenerator(
	            name="history_sequance",
	            sequenceName="history_sequance",
	            allocationSize=1
	    )
	  @GeneratedValue(
	            strategy=GenerationType.SEQUENCE,
	            generator="history_sequance"
	    )
	 
	@Column(name="activity_id")
	public Long ActivityId;
	 
	@Column(name="activity_name")
	public String ActivityName;
	
	@Column(name="activity_type")
	public String ActivityType;
	
	@Column(name="animator_id")
	public Long AnimatorId;
	
	@Column(name="capacity")
	public int Capacity;
	
	@Column(name="date")
	public String Date;
	
	@Column(name="hour")
	public String Hour;
	
	@Column(name="internet")
	public String Internet;
	
	@Column(name="type_activity")
	public String TypeActivity;

	public History() {
	}

	public History(Long activityId,
			String activityName,
			String activityType,
			Long animatorId,
			int capacity,
			String date,
			String hour,
			String internet,
			String typeActivity) {
		this.ActivityId = activityId;
		this.ActivityName = activityName;
		this.ActivityType = activityType;
		this.AnimatorId = animatorId;
		this.Capacity = capacity;
		this.Date = date;
		this.Hour = hour;
		this.Internet = internet;
		this.TypeActivity = typeActivity;
	}

	public History(String activityName,
			String activityType,
			Long animatorId,
			int capacity,
			String date,
			String hour,
			String internet,
			String typeActivity) {
		this.ActivityName = activityName;
		this.ActivityType = activityType;
		this.AnimatorId = animatorId;
		this.Capacity = capacity;
		this.Date = date;
		this.Hour = hour;
		this.Internet = internet;
		this.TypeActivity = typeActivity;
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

	public String getActivityType() {
		return ActivityType;
	}

	public void setActivityType(String activityType) {
		ActivityType = activityType;
	}

	public Long getAnimatorId() {
		return AnimatorId;
	}

	public void setAnimatorId(Long animatorId) {
		AnimatorId = animatorId;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
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

	public String getInternet() {
		return Internet;
	}

	public void setInternet(String internet) {
		Internet = internet;
	}

	public String getTypeActivity() {
		return TypeActivity;
	}

	public void setTypeActivity(String typeActivity) {
		TypeActivity = typeActivity;
	}

	@Override
	public String toString() {
		return "History {" +
	",ActivityId=" + ActivityId +
	", ActivityName=" + ActivityName +
	", ActivityType=" + ActivityType +
	", AnimatorId=" + AnimatorId +
	", Capacity=" + Capacity +
	", Date=" + Date +
	", Hour=" + Hour +
	", Internet=" + Internet +
	", TypeActivity=" + TypeActivity + "}";
	}
	

}
