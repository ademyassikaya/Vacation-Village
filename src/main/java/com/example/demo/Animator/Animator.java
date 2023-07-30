package com.example.demo.Animator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Animator 
{
	
	@Id
	@SequenceGenerator(
			name="animator_sequence",
			sequenceName="animator_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy= GenerationType.SEQUENCE,
			generator="animator_sequence")

	private Long EmployeeId;
	private String Name;
	private String PhoneNumber;
	private String ExpertiseArea;
	private String AniUserPassword;
	
	public Animator() {
		
	}
	
	public Animator(Long employeeId,
			String name,
			String phoneNumber,
			String expertiseArea,
			String aniUserPassword) {
		this.EmployeeId = employeeId;
		this.Name = name;
		this.PhoneNumber = phoneNumber;
		this.ExpertiseArea = expertiseArea;
		this.AniUserPassword = aniUserPassword;
	}
	
	public Animator(String name,
			String phoneNumber,
			String expertiseArea,
			String aniUserPassword) {
		this.Name = name;
		this.PhoneNumber = phoneNumber;
		this.ExpertiseArea = expertiseArea;
		this.AniUserPassword = aniUserPassword;
	}
	public Long getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Long employeeId) {
		EmployeeId = employeeId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getExpertiseArea() {
		return ExpertiseArea;
	}

	public void setExpertiseArea(String expertiseArea) {
		ExpertiseArea = expertiseArea;
	}

	public String getAniUserPassword() {
		return AniUserPassword;
	}

	public void setAniUserPassword(String aniUserPassword) {
		AniUserPassword = aniUserPassword;
	}
	@Override
	public String toString() {
		return "Animator {" +
				"EmployeeId=" + EmployeeId +
				", Name=" + Name +
				", PhoneNumber=" + PhoneNumber +
				", ExpertiseArea=" + ExpertiseArea +
				", AniUserPassword=" + AniUserPassword + "}";
	}

}
