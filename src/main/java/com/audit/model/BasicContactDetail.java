package com.audit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "basiccontactdetail")
public class BasicContactDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	public String firstName;
	
	public String lastName;
	
	public String whatsappCountryCode;
		
	public int whatsappMobileNumber;
	
	public String email;
	
	public java.util.Date createdTs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public String getWhatsappcountrycode() {
		return whatsappCountryCode;
	}

	public void setWhatsappcountrycode(String whatsappCountryCode) {
		this.whatsappCountryCode = whatsappCountryCode;
	}

	public int getWhatsappmobilenumber() {
		return whatsappMobileNumber;
	}

	public void setWhatsappmobilenumber(int whatsappMobileNumber) {
		this.whatsappMobileNumber = whatsappMobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getCreatedts() {
		return createdTs;
	}

	public void setCreatedts(java.util.Date createdTs) {
		this.createdTs = createdTs;
	}
}