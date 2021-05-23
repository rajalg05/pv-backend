package com.audit.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "audit_allocation")
public class AuditAllocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id; 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public AuditAllocation() {
		super();
	}

	public AuditAllocation(Audit audit, Resource resource, LocalDateTime allocatedAt, String allocatedBy,
			LocalDateTime auditDate, Integer auditDay) {
		super();
		this.audit = audit;
		this.resource = resource;
		this.allocatedAt = allocatedAt;
		this.allocatedBy = allocatedBy;
		this.auditDate = auditDate;
		this.auditDay = auditDay;
	}

	@ManyToOne
    @JoinColumn(name = "audit_id")
    Audit audit;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    Resource resource;

    LocalDateTime allocatedAt;

    String allocatedBy;
    
    LocalDateTime auditDate;

    Integer auditDay;

	public LocalDateTime getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(LocalDateTime auditDate) {
		this.auditDate = auditDate;
	}
	public Integer getAuditDay() {
		return auditDay;
	}
	public void setAuditDay(Integer auditDay) {
		this.auditDay = auditDay;
	}
	public Audit getAudit() {
		return audit;
	}
	public void setAudit(Audit audit) {
		this.audit = audit;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public LocalDateTime getAllocatedAt() {
		return allocatedAt;
	}
	public void setAllocatedAt(LocalDateTime allocatedAt) {
		this.allocatedAt = allocatedAt;
	}
	public String getAllocatedBy() {
		return allocatedBy;
	}
	public void setAllocatedBy(String allocatedBy) {
		this.allocatedBy = allocatedBy;
	}
    
    
}
