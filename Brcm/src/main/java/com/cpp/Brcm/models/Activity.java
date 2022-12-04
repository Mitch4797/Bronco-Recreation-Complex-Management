package com.cpp.Brcm.models;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "activities")
public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long activityID;

	@Column(nullable = false)
	private String name;

	@Column(scale = 2, precision = 10, nullable = false)
	private BigDecimal price;

	@OneToMany(mappedBy = "activity", cascade = { CascadeType.ALL })
	private List<HistoricalPrice> priceHistory = new ArrayList<>();

	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "activity_orders", joinColumns = @JoinColumn(name = "activity_id"),
		inverseJoinColumns = @JoinColumn(name = "order_id"))
	private List<Visit> orders_used_in;

	public Activity() {
	}

	public Activity(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public List<HistoricalPrice> getPriceHistory() {
		return priceHistory;
	}

	public List<Visit> getOrders_used_in() {
		return orders_used_in;
	}

	public void changePrice(Date date, BigDecimal price) {
		priceHistory.add(new HistoricalPrice(this, date, price));
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Activity))
			return false;

		var r = (Activity) o;
		return r.name.equals(this.name) && r.price.equals(this.price);
	}

}
