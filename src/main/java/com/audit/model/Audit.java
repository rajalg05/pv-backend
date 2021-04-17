package com.audit.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "audit")
public class Audit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@ManyToOne( cascade = CascadeType.ALL) 
	public Job job;
	
	public String auditStatus;
    
	public LocalDateTime dateOfAudit;
    
	public int auditLocationAddressId;
    
	public String statusUpdatedBy;
    
	public Double paymentReceived;
    
	public LocalDateTime createdTs;
    
	public LocalDateTime updatedTs;
	
    public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
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
	public int getAuditLocationAddressId() {
		return auditLocationAddressId;
	}
	public void setAuditLocationAddressId(int auditLocationAddressId) {
		this.auditLocationAddressId = auditLocationAddressId;
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
