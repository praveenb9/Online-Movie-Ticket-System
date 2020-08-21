package com.capg.omts.user.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


import org.springframework.format.annotation.DateTimeFormat;
@Entity
@DiscriminatorValue("admin")
public class Admin extends User {
	
	private int adminId;
	private String adminName;
	private String adminPassword;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate dateOfBirth;
	private String adminContact;
	
	public Admin() {
		
	}

	public Admin(int adminId, String adminName, String adminPassword, LocalDate dateOfBirth, String adminContact) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.dateOfBirth = dateOfBirth;
		this.adminContact = adminContact;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", dateOfBirth=" + dateOfBirth + ", adminContact=" + adminContact + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminContact == null) ? 0 : adminContact.hashCode());
		result = prime * result + adminId;
		result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
		result = prime * result + ((adminPassword == null) ? 0 : adminPassword.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (adminContact == null) {
			if (other.adminContact != null)
				return false;
		} else if (!adminContact.equals(other.adminContact))
			return false;
		if (adminId != other.adminId)
			return false;
		if (adminName == null) {
			if (other.adminName != null)
				return false;
		} else if (!adminName.equals(other.adminName))
			return false;
		if (adminPassword == null) {
			if (other.adminPassword != null)
				return false;
		} else if (!adminPassword.equals(other.adminPassword))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		return true;
	}
	
	
	
}

