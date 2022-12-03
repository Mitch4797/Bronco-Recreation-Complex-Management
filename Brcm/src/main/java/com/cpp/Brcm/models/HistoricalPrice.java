package com.cpp.Brcm.models;

import java.math.BigDecimal;
import java.sql.Date;
import com.cpp.Brcm.models.Activity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "historical_prices")
public class HistoricalPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private Date date;

	@Column(scale = 2, precision = 10, nullable = false)
	private BigDecimal price;

	@ManyToOne
	@JoinColumn(name = "activity_id", nullable = false)
	private Activity activity;

	public HistoricalPrice() {
	}

	public HistoricalPrice(Activity activity, Date date, BigDecimal price) {
		this.activity = activity;
		this.date = date;
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Activity getActivity() {
		return activity;
	}
}
