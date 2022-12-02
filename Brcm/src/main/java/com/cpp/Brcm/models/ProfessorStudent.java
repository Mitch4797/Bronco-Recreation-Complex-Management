package com.cpp.Brcm.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ProfessorStudent")
public class ProfessorStudent extends Customer {
	@Column(name = "enter_date")
	protected Date enterDate;

	@Column(name = "grad_date")
	protected Date gradDate;

	private String major;

	private String minor;

	private String department;

	private String office;

	private String research;

	public ProfessorStudent() {
	}

	public ProfessorStudent(int broncoID, Date dob, String fullname, int phone, Date enterDate,
					Date gradDate, String major, String minor, String department, String office,
					String research, Address address) {

		super(broncoID, dob, fullname, phone, address);

		this.research = research;
		this.office = office;
		this.department = department;
		this.minor = minor;
		this.major = major;
		this.gradDate = gradDate;
		this.enterDate = enterDate;
	}

	public Date getEnterDate() {
		return enterDate;
	}

	public Date getGradDate() {
		return gradDate;
	}

	public String getMajor() {
		return major;
	}

	public String getMinor() {
		return minor;
	}

	public String getDepartment() {
		return department;
	}

	public String getOffice() {
		return office;
	}

	public String getResearch() {
		return research;
	}

}
