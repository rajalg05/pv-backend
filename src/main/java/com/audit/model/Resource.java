package com.audit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "resource")
public class Resource {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy = "contactDetailId")
	private BasicContactDetail basicContactDetail;  
	
	@OneToOne(mappedBy = "kycId")
	private KYC kyc;
	
	@OneToOne(mappedBy = "addressId")
	private Address address;
	
	private int contactDetailId;
	
	private int kycId;
	
	private int addressId;
	
	private java.util.Date dateOfBirth;
	
	private String qualification;
	
	private String excelSkills;
	
	private String stockAuditExp;
	
	private String resourceType;
	
	private java.util.Date createdTs;
	
	private java.util.Date updatedTs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContactdetailid() {
		return contactDetailId;
	}

	public void setContactdetailid(int contactDetailId) {
		this.contactDetailId = contactDetailId;
	}

	public int getKycid() {
		return kycId;
	}

	public void setKycid(int kycId) {
		this.kycId = kycId;
	}

	public int getAddressid() {
		return addressId;
	}

	public void setAddressid(int addressId) {
		this.addressId = addressId;
	}

	public java.util.Date getDateofbirth() {
		return dateOfBirth;
	}

	public void setDateofbirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExcelskills() {
		return excelSkills;
	}

	public void setExcelskills(String excelSkills) {
		this.excelSkills = excelSkills;
	}

	public String getStockauditexp() {
		return stockAuditExp;
	}

	public void setStockauditexp(String stockAuditExp) {
		this.stockAuditExp = stockAuditExp;
	}

	public String getResourcetype() {
		return resourceType;
	}

	public void setResourcetype(String resourceType) {
		this.resourceType = resourceType;
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