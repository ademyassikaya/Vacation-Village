package com.example.demo.IndiviualActivity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class IndiviualActivity 
{
	@Id
	@SequenceGenerator(
			name="indiviualActivity_sequence",
			sequenceName="indiviualActivity_sequence",
			allocationSize=1)
	@GeneratedValue(
			strategy= GenerationType.SEQUENCE,
			generator="indiviualActivity_sequence")
	private Long ActivityId;
	private String ActivityName;
	private String InternetLink;
	private String ActivityType;
	private int AgeReq;
	private Long AnimatorId;
	private String DateHour;
	
	
	public IndiviualActivity() 
	{
	}


	public IndiviualActivity(Long activityId,
			String activityName,
			String internetLink,
			String activityType,
			int ageReq,
			Long animatorId,
			String dateHour) {
		this.ActivityId = activityId;
		this.ActivityName = activityName;
		this.InternetLink = internetLink;
		this.ActivityType = activityType;
		this.AgeReq = ageReq;
		this.AnimatorId = animatorId;
		this.DateHour = dateHour;
	}


	public IndiviualActivity(String activityName,
			String internetLink,
			String activityType,
			int ageReq,
			Long animatorId,
			String dateHour) 
	{
		this.ActivityName = activityName;
		this.InternetLink = internetLink;
		this.ActivityType = activityType;
		this.AgeReq = ageReq;
		this.AnimatorId = animatorId;
		this.DateHour = dateHour;
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


	public String getInternetLink() {
		return InternetLink;
	}


	public void setInternetLink(String internetLink) {
		InternetLink = internetLink;
	}


	public String getActivityType() {
		return ActivityType;
	}


	public void setActivityType(String activityType) {
		ActivityType = activityType;
	}


	public int getAgeReq() {
		return AgeReq;
	}


	public void setAgeReq(int ageReq) {
		AgeReq = ageReq;
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
		return "İndiviualActivity {" +
	",ActivityId=" + ActivityId +
	", ActivityName=" + ActivityName +
	", InternetLink=" + InternetLink +
	", ActivityType=" + ActivityType +
	", AgeReq=" + AgeReq +
	", AnimatorId=" + AnimatorId +
	", DateHour=" + DateHour + "}";
	}
	
	
	
}
