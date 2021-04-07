package com.audit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "job")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(targetEntity = Associate.class)
	private Associate associate;

	private int clientName;

	private String frequencyOfAudit;

	private String paymentType;

	private double totalPayment;

	private int resourcesNeeded;

	private java.util.Date createdTs;

	private java.util.Date updatedTs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientname() {
		return clientName;
	}

	public void setClientname(int clientName) {
		this.clientName = clientName;
	}

	public String getFrequencyofaudit() {
		return frequencyOfAudit;
	}

	public void setFrequencyofaudit(String frequencyOfAudit) {
		this.frequencyOfAudit = frequencyOfAudit;
	}

	public String getPaymenttype() {
		return paymentType;
	}

	public void setPaymenttype(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getTotalpayment() {
		return totalPayment;
	}

	public void setTotalpayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}

	public int getResourcesneeded() {
		return resourcesNeeded;
	}

	public void setResourcesneeded(int resourcesNeeded) {
		this.resourcesNeeded = resourcesNeeded;
	}

	public java.util.Date getCreatedts() {
		return createdTs;
	}

	public void setCreatedts(java.util.Date createdTs) {
		this.createdTs = createdTs;
	}

	public java.util.Date getUpdatedts() {
		return updatedTs;
	}

	public void setUpdatedts(java.util.Date updatedTs) {
		this.updatedTs = updatedTs;
	}
}