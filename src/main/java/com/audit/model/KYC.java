package com.audit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kyc")
public class KYC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstKycId;
	
	private String firstKycType;
	
	private String secondKycId;
	
	private String secondKycType;
	
	private String firstKycFrontImagePath;
	
	private String firstKycBackImagePath;
	
	private String secondKycFrontImagePath;
	
	private String secondKycBackImagePath;
	
	private java.util.Date createdTs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstkycid() {
		return firstKycId;
	}

	public void setFirstkycid(String firstKycId) {
		this.firstKycId = firstKycId;
	}

	public String getFirstkyctype() {
		return firstKycType;
	}

	public void setFirstkyctype(String firstKycType) {
		this.firstKycType = firstKycType;
	}

	public String getSecondkycid() {
		return secondKycId;
	}

	public void setSecondkycid(String secondKycId) {
		this.secondKycId = secondKycId;
	}

	public String getSecondkyctype() {
		return secondKycType;
	}

	public void setSecondkyctype(String secondKycType) {
		this.secondKycType = secondKycType;
	}

	public String getFirstkycfrontimagepath() {
		return firstKycFrontImagePath;
	}

	public void setFirstkycfrontimagepath(String firstKycFrontImagePath) {
		this.firstKycFrontImagePath = firstKycFrontImagePath;
	}

	public String getFirstkycbackimagepath() {
		return firstKycBackImagePath;
	}

	public void setFirstkycbackimagepath(String firstKycBackImagePath) {
		this.firstKycBackImagePath = firstKycBackImagePath;
	}

	public String getSecondkycfrontimagepath() {
		return secondKycFrontImagePath;
	}

	public void setSecondkycfrontimagepath(String secondKycFrontImagePath) {
		this.secondKycFrontImagePath = secondKycFrontImagePath;
	}

	public String getSecondkycbackimagepath() {
		return secondKycBackImagePath;
	}

	public void setSecondkycbackimagepath(String secondKycBackImagePath) {
		this.secondKycBackImagePath = secondKycBackImagePath;
	}

	public java.util.Date getCreatedts() {
		return createdTs;
	}

	public void setCreatedts(java.util.Date createdTs) {
		this.createdTs = createdTs;
	}
}