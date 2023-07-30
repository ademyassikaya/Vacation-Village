package com.example.demo.Equipment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Equipment 
{

	@Id
	@SequenceGenerator(
			name="equipment_sequence",
			sequenceName="equipment_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy= GenerationType.SEQUENCE,
			generator="equipment_sequence")

	
	
	private Long EquipmentId;
	private Long EquipPersonSsn;
	private String EquipmentName;
	private String Purpose;
	
	
	
	
	public Equipment() {
	}


	public Equipment(Long equipmentId,
			Long equipPersonSsn,
			String equipmentName,
			String purpose) {
		this.EquipmentId = equipmentId;
		this.EquipPersonSsn = equipPersonSsn;
		this.EquipmentName = equipmentName;
		this.Purpose = purpose;
	}


	public Equipment(Long equipPersonSsn,
			String equipmentName,
			String purpose) {
		this.EquipPersonSsn = equipPersonSsn;
		this.EquipmentName = equipmentName;
		this.Purpose = purpose;
	}


	public Long getEquipmentId() {
		return EquipmentId;
	}


	public void setEquipmentId(Long equipmentId) {
		EquipmentId = equipmentId;
	}


	public Long getEquipPersonSsn() {
		return EquipPersonSsn;
	}


	public void setEquipPersonSsn(Long equipPersonSsn) {
		EquipPersonSsn = equipPersonSsn;
	}


	public String getEquipmentName() {
		return EquipmentName;
	}


	public void setEquipmentName(String equipmentName) {
		EquipmentName = equipmentName;
	}


	public String getPurpose() {
		return Purpose;
	}


	public void setPurpose(String purpose) {
		Purpose = purpose;
	}


	@Override
	public String toString() {
		return "Equipment {" +
				"EquipmentId=" + EquipmentId +
				", EquipPersonSsn=" + EquipPersonSsn +
				", EquipmentName="+ EquipmentName +
				", Purpose=" + Purpose + "}";
	}
	
	
	
	
	
	
	
	
	
	
	
}
