package com.myProjects.DTO;
// Generated 26 Jan, 2018 5:30:47 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ParentsId generated by hbm2java
 */
@Embeddable
public class ParentsId implements java.io.Serializable{
	private int id;
	private String firstName; 
	private String lastName;
	private String contactNo;
	private String email;
	private String password;
	private int userId;

	public ParentsId() {
	}

	public ParentsId(int id, String firstName, String lastName, String contactNo, String password, int userId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.password = password;
		this.userId = userId;
	}

	public ParentsId(int id, String firstName, String lastName, String contactNo, String email, String password,
			int userId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
		this.userId = userId;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "firstName", nullable = false, length = 20)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName", nullable = false, length = 20)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "contactNo", nullable = false, length = 10)
	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Column(name = "email", length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 30)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "userID", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
}
