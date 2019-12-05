package com.cognizant.clinix.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private long adminId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "email_id")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "security_question")
	private String securityQue;
	
	@Column(name = "security_question_answer")
	private String securityAns;

	@Column(name = "age")
	private long age;

	@Column(name = "contact_number")
	private long contactNumber;

	@Column(name = "alt_contact_number")
	private long altContactNumber;

	public Admin() {
		super();
	}

	public Admin(long adminId, String firstName, String lastName, String gender, Date dateOfBirth, String email,
			String password, String securityQue, String securityAns, long age, long contactNumber,
			long altContactNumber) {
		super();
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
		this.securityQue = securityQue;
		this.securityAns = securityAns;
		this.age = age;
		this.contactNumber = contactNumber;
		this.altContactNumber = altContactNumber;
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQue() {
		return securityQue;
	}

	public void setSecurityQue(String securityQue) {
		this.securityQue = securityQue;
	}

	public String getSecurityAns() {
		return securityAns;
	}

	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public long getAltContactNumber() {
		return altContactNumber;
	}

	public void setAltContactNumber(long altContactNumber) {
		this.altContactNumber = altContactNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (adminId ^ (adminId >>> 32));
		result = prime * result + (int) (age ^ (age >>> 32));
		result = prime * result + (int) (altContactNumber ^ (altContactNumber >>> 32));
		result = prime * result + (int) (contactNumber ^ (contactNumber >>> 32));
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((securityAns == null) ? 0 : securityAns.hashCode());
		result = prime * result + ((securityQue == null) ? 0 : securityQue.hashCode());
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
		if (adminId != other.adminId)
			return false;
		if (age != other.age)
			return false;
		if (altContactNumber != other.altContactNumber)
			return false;
		if (contactNumber != other.contactNumber)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (securityAns == null) {
			if (other.securityAns != null)
				return false;
		} else if (!securityAns.equals(other.securityAns))
			return false;
		if (securityQue == null) {
			if (other.securityQue != null)
				return false;
		} else if (!securityQue.equals(other.securityQue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", password=" + password
				+ ", securityQue=" + securityQue + ", securityAns=" + securityAns + ", age=" + age + ", contactNumber="
				+ contactNumber + ", altContactNumber=" + altContactNumber + "]";
	}

	
}
