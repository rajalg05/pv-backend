package com.audit.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "audit")
public class Audit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@ManyToOne
	@JoinColumn(name = "id",insertable = false, updatable = false)
	public Job job;
	
	@OneToOne( cascade = CascadeType.ALL) 
	public Address address;
	
	public String auditStatus;
    
	public LocalDateTime dateOfAudit;
    
	//public int auditLocationAddressId;
    
	public String statusUpdatedBy;
    
	public Double paymentReceived;
    
	public LocalDateTime createdTs;
    
	public LocalDateTime updatedTs;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public LocalDateTime getDateOfAudit() {
		return dateOfAudit;
	}
	public void setDateOfAudit(LocalDateTime dateOfAudit) {
		this.dateOfAudit = dateOfAudit;
	} 
	public String getStatusUpdatedBy() {
		return statusUpdatedBy;
	}
	public void setStatusUpdatedBy(String statusUpdatedBy) {
		this.statusUpdatedBy = statusUpdatedBy;
	}
	public Double getPaymentReceived() {
		return paymentReceived;
	}
	public void setPaymentReceived(Double paymentReceived) {
		this.paymentReceived = paymentReceived;
	}
	public LocalDateTime getCreatedTs() {
		return createdTs;
	}
	public void setCreatedTs(LocalDateTime createdTs) {
		this.createdTs = createdTs;
	}
	public LocalDateTime getUpdatedTs() {
		return updatedTs;
	}
	public void setUpdatedTs(LocalDateTime updatedTs) {
		this.updatedTs = updatedTs;
	}
    
}
