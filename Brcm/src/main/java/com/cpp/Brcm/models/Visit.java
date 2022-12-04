package com.cpp.Brcm.models;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "visits")
public class Visit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private Timestamp datetime;

	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "activity_orders", joinColumns = @JoinColumn(name = "order_id"),
		inverseJoinColumns = @JoinColumn(name = "activity_id"))
	private List<Activity> activities;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@Column(nullable = false, precision = 10, scale = 2, name = "total")
	private BigDecimal totalAfterDiscount;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private VisitStatus status;

	public int activityCount() {
		return activities.size();
	}

	public Visit() {
	}

	public Visit(Customer customer, List<Activity> activities, Timestamp datetime,
					BigDecimal price, VisitStatus status) {
		this.customer = customer;
		this.activities = activities;
		this.datetime = datetime;
		this.totalAfterDiscount = price;
		this.status = status;
	}

	public Timestamp getDatetime() {
		return datetime;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public Customer getCustomer() {
		return customer;
	}

	public BigDecimal getTotalAfterDiscount() {
		return totalAfterDiscount;
	}

	public VisitStatus getStatus() {
		return status;
	}
}
