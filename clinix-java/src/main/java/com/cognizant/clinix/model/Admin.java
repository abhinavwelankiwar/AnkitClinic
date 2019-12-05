package com.cognizant.clinix.model;

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
	private String dateOfBirth;
	@Column(name = "email_id")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "security_question")
	private String security_que;
	@Column(name = "security_question_answer")
	private String security_ans;

	@Column(name = "age")
	private long age;

	@Column(name = "contact_number")
	private long contact;

	@Column(name = "alt_contact_number")
	private long alt_contact;

	public Admin() {
		super();
	}

	public Admin(long adminId, String firstName, String lastName, String gender, String dateOfBirth, String email,
			String password, String security_que, String security_ans, long age, long contact, long alt_contact) {
		super();
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
		this.security_que = security_que;
		this.security_ans = security_ans;
		this.age = age;
		this.contact = contact;
		this.alt_contact = alt_contact;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
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

	public String getSecurity_que() {
		return security_que;
	}

	public void setSecurity_que(String security_que) {
		this.security_que = security_que;
	}

	public String getSecurity_ans() {
		return security_ans;
	}

	public void setSecurity_ans(String security_ans) {
		this.security_ans = security_ans;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getAlt_contact() {
		return alt_contact;
	}

	public void setAlt_contact(long alt_contact) {
		this.alt_contact = alt_contact;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", password=" + password
				+ ", security_que=" + security_que + ", security_ans=" + security_ans + ", age=" + age + ", contact="
				+ contact + ", alt_contact=" + alt_contact + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (adminId ^ (adminId >>> 32));
		result = prime * result + (int) (age ^ (age >>> 32));
		result = prime * result + (int) (alt_contact ^ (alt_contact >>> 32));
		result = prime * result + (int) (contact ^ (contact >>> 32));
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((security_ans == null) ? 0 : security_ans.hashCode());
		result = prime * result + ((security_que == null) ? 0 : security_que.hashCode());
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
		if (alt_contact != other.alt_contact)
			return false;
		if (contact != other.contact)
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
		if (security_ans == null) {
			if (other.security_ans != null)
				return false;
		} else if (!security_ans.equals(other.security_ans))
			return false;
		if (security_que == null) {
			if (other.security_que != null)
				return false;
		} else if (!security_que.equals(other.security_que))
			return false;
		return true;
	}

}
