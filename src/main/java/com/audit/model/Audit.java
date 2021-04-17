package com.audit.model;

import java.time.LocalDateTime;

public class Audit {
	
	public int jobId;
	public String auditStatus;
    public LocalDateTime dateOfAudit;
    public int auditLocationAddressId;
    public String statusUpdatedBy;
    public Double paymentReceived;
    public LocalDateTime createdTs;
    public LocalDateTime updatedTs;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
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
