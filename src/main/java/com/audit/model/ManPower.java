package com.audit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MANPOWER")
public class ManPower {
	@Id
	@Column(name = "TLPUNE")
    String tlPune;
	
	@Column(name = "EDUCATION")
    String education;
	
	@Column(name = "EXCELSKILLS")
    String excelSkills;
	
	@Column(name = "TLNONTL")
    String tlNonTl;
	
	@Column(name = "CITY")
    String city;
	
	@Column(name = "STATE")
    String state;
	
	@Column(name = "FREQUENCY")
    String frequency;
	
	@Column(name = "TLMUMBAI")
    String tlMumbai; 
	
	@Column(name = "TLOTHERS")
    String tlOthers;
	
	@Column(name = "AUDITSTATUS")
    String auditStatus;

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExcelSkills() {
		return excelSkills;
	}

	public void setExcelSkills(String excelSkills) {
		this.excelSkills = excelSkills;
	}

	public String getTlNonTl() {
		return tlNonTl;
	}

	public void setTlNonTl(String tlNonTl) {
		this.tlNonTl = tlNonTl;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getTlPune() {
		return tlPune;
	}

	public void setTlPune(String tlPune) {
		this.tlPune = tlPune;
	}

	public String getTlMumbai() {
		return tlMumbai;
	}

	public void setTlMumbai(String tlMumbai) {
		this.tlMumbai = tlMumbai;
	}

	public String getTlOthers() {
		return tlOthers;
	}

	public void setTlOthers(String tlOthers) {
		this.tlOthers = tlOthers;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	
	
}









