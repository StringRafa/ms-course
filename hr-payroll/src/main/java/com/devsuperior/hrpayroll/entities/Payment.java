package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nameString;
	private Double dailyIncome;
	private Integer days;
	
	public Payment() {
		
	}

	public Payment(String nameString, Double dailyIncome, Integer days) {
		super();
		this.nameString = nameString;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days * dailyIncome;
	}
}
