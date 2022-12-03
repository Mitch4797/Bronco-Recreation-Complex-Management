package com.cpp.Brcm.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "customers")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,
    name = "Cust_Type")
public class Customer {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int customerID;

	@Column(name = "bronco_id", nullable = false)
	private int broncoID;

	@Column(name = "dob")
	protected Date dateOfBirth;

	@Column(nullable = false)
	private String name;

	@ManyToOne
	@JoinColumn(name = "address_id")
	protected Address address;

	private int phone;
	
	@OneToMany(mappedBy = "customer", cascade = { CascadeType.PERSIST })
	private List<Order> orders;

	

	/*
	 * @Enumerated(EnumType.STRING)
	 * 
	 * @Column(nullable = false, name = "customer_type", updatable = false,
	 * insertable = false) private CustType type;
	 */

	public Integer getBroncoID() {
		return this.broncoID;
	}

	public Customer() {
	}

	public Customer(int broncoID, Date dob, String fullname, int phone, Address address) {
		this.name = fullname;
		this.address = address;
		this.broncoID = broncoID;
		this.dateOfBirth = dob;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	/*
	 * public CustType getType() { return type; }
	 */

	public void setBroncoId(int broncoId) {
		this.broncoID = broncoId;
	}

	public Date getDOB() {
		return dateOfBirth;
	}

}
