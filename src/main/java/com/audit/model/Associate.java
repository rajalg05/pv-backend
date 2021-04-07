package com.audit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "associate")
public class Associate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne 
	private BasicContactDetail basicContactDetail;  
	
	@OneToOne 
	private KYC kyc;
	
	@OneToOne 
	private Address address;
		
	private java.util.Date createdTs;
	
	private java.util.Date updatedTs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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