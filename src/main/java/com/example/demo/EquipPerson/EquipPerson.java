package com.example.demo.EquipPerson;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class EquipPerson 
{
	
	
	@Id
	@SequenceGenerator(
			name="equipPerson_sequence",
			sequenceName="equipPerson_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy= GenerationType.SEQUENCE,
			generator="equipPerson_sequence")


	private Long Ssn;
	private String Name;
	private String Surname;
	private String EquPhoneNumber;
	private String EquUserPassword;
	
	public EquipPerson() {
		
	}
	
	public EquipPerson(Long ssn,
			String name,
			String surname,
			String equPhoneNumber,
			String equUserPassword) {
		this.Ssn = ssn;
		this.Name = name;
		this.Surname = surname;
		this.EquPhoneNumber = equPhoneNumber;
		this.EquUserPassword = equUserPassword;
	}


	
	public EquipPerson(String name,
			String surname,
			String equPhoneNumber,
			String equUserPassword) {
		this.Name = name;
		this.Surname = surname;
		this.EquPhoneNumber = equPhoneNumber;
		this.EquUserPassword = equUserPassword;
	}



	
	
	public Long getSsn() {
		return Ssn;
	}



	public void setSsn(Long ssn) {
		Ssn = ssn;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getSurname() {
		return Surname;
	}



	public void setSurname(String surname) {
		Surname = surname;
	}



	public String getEquPhoneNumber() {
		return EquPhoneNumber;
	}



	public void setEquPhoneNumber(String equPhoneNumber) {
		EquPhoneNumber = equPhoneNumber;
	}



	public String getEquUserPassword() {
		return EquUserPassword;
	}



	public void setEquUserPassword(String equUserPassword) {
		EquUserPassword = equUserPassword;
	}
	
	@Override
	public String toString() {
		return "EquipPerson {" + 
				"Ssn=" + Ssn +
				", Name=" + Name +
				", Surname=" + Surname +
				", EquPhoneNumber=" + EquPhoneNumber +
				", EquUserPassword=" + EquUserPassword + "}";
	}


}
