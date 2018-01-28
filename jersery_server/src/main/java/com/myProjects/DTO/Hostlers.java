package com.myProjects.DTO;
// Generated 26 Jan, 2018 5:30:47 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Hostlers generated by hbm2java
 */
@XmlRootElement
@Entity
@Table(name = "hostlers", catalog = "hmsystem")
public class Hostlers{

	private Integer id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String contactNo;
	private String contactAlternate;
	private String inquiryDate;
	private String admissionDate;
	private String leaveDate;
	private List<Hsttransections> hsttransectionses = new ArrayList<Hsttransections>();
	private List<Parents> parentses = new ArrayList<Parents>();



	@Id
	//This is Used for AutoIncrement 
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "eMail", length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Column(name = "contact_no", nullable = false, length = 10)
	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Column(name = "contact_alternate", length = 10)
	public String getContactAlternate() {
		return this.contactAlternate;
	}

	public void setContactAlternate(String contactAlternate) {
		this.contactAlternate = contactAlternate;
	}

	@Column(name = "inquiry_date", length = 10)
	public String getInquiryDate() {
		return this.inquiryDate;
	}

	public void setInquiryDate(String inquiryDate) {
		this.inquiryDate = inquiryDate;
	}

	@Column(name = "admission_date", length = 10)
	public String getAdmissionDate() {
		return this.admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	@Column(name = "leave_date", length = 10)
	public String getLeaveDate() {
		return this.leaveDate;
	}

	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}

	@Column(name="password", nullable=false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hostlers")
	public List<Hsttransections> getHsttransectionses() {
		return this.hsttransectionses;
	}

	public void setHsttransectionses(List<Hsttransections> hsttransectionses) {
		this.hsttransectionses = hsttransectionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hostlers")
	public List<Parents> getParentses() {
		return this.parentses;
	}

	public void setParentses(List<Parents> parentses) {
		this.parentses = parentses;
	}


	@Override
	public String toString() {
		return "Hostlers [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNo=" + contactNo + ", contactAlternate=" + contactAlternate + ", inquiryDate=" + inquiryDate
				+ ", admissionDate=" + admissionDate + ", leaveDate=" + leaveDate + ", hsttransectionses="
				+ hsttransectionses + ", parentses=" + parentses + "]";
	}
	
	

}
