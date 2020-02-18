package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class studentdata {
	
	
	@Id
	@Column(name="name",length=50)
	public String Name;
	
	
	
	
	
	
	
	   
	@Column(name="roomnumber")
	public int RoomNumber;
	
	@Column(name="course")
	public String Course;
	
	@Column(name="mobilenumber")
	public long MobileNumber;
	
	
	
	public studentdata() {
		
	}



	public studentdata(String name, int roomNumber, String course, long mobileNumber) {
		super();
	
		Name = name;
		RoomNumber = roomNumber;
		Course = course;
		MobileNumber = mobileNumber;
	}
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getRoomNumber() {
		return RoomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}

}
