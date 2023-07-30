 package com.example.demo.Customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table
public class Customer {
	/* Bu kısımda entityler gösterilmedir.
	   Veriler toString formatında alınmış. Getter ile okuyabilmek için tanılmış ve 
	   Setter ile yazılmak için uygun hale getirilmiştir. */
	@Id
	@SequenceGenerator(
			name="customer_sequence",
			sequenceName="customer_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "customer_sequence"
			)
	private Long VacationVillageId;
	private String Name;
	private int Age;
	private String RoomNumber;
	private String ContactPhone;
	private String UserPassword;
	
	public Customer() {
		
	}

	public Customer(Long vacationVillageId,
			String name,
			int age,
			String roomNumber,
			String contactPhone,
			String UserPassword) {
		this.VacationVillageId = vacationVillageId;
		this.Name = name;
		this.Age = age;
		this.RoomNumber = roomNumber;
		this.ContactPhone = contactPhone;
		this.UserPassword = UserPassword;
	}

	public Customer(String name,
			int age,
			String roomNumber,
			String contactPhone,
			String userPassword) {
		this.Name = name;
		this.Age = age;
		this.RoomNumber = roomNumber;
		this.ContactPhone = contactPhone;
		this.UserPassword = userPassword;
	}

	public Long getVacationVillageId() {
		return VacationVillageId;
	}

	public void setVacationVillageId(Long vacationVillageId) {
		this.VacationVillageId = vacationVillageId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getRoomNumber() {
		return RoomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.RoomNumber = roomNumber;
	}

	public String getContactPhone() {
		return ContactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.ContactPhone = contactPhone;
	}
	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		this.UserPassword = userPassword;
	}
	

	@Override
	public String toString() {
		return "Customer {" + 
	"VacationVillageId=" + VacationVillageId +
	", Name=" + Name +
	", Age=" + Age +
	", RoomNumber=" + RoomNumber +
	", ContactPhone=" + ContactPhone +
	", UserPassword =" + UserPassword +"}";
	}
	
	
	
	
	
	
	
	
	
	
	
}
