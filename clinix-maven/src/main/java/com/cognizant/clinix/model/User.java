package com.cognizant.clinix.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long userId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "security_que")
	private String security_que;
	@Column(name = "security_ans")
	private String security_ans;
	
	@Column(name = "age")
	private long age;
	
	@Column(name = "contact")
	private long contact;
	
	@Column(name = "alt_contact")
	private long alt_contact;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "ur_us_id"), inverseJoinColumns = @JoinColumn(name = "ur_ro_id"))
	private Set<Role> roleList = new HashSet<Role>();
	
	public User() {
		super();
	}

	public User(long userId, String firstName, String lastName, String gender, Date dateOfBirth, String email,
			String password, String security_que, String security_ans, long age, long contact, long alt_contact,
			Set<Role> roleList) {
		super();
		this.userId = userId;
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
		this.roleList = roleList;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public Set<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (age ^ (age >>> 32));
		result = prime * result + (int) (alt_contact ^ (alt_contact >>> 32));
		result = prime * result + (int) (contact ^ (contact >>> 32));
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roleList == null) ? 0 : roleList.hashCode());
		result = prime * result + ((security_ans == null) ? 0 : security_ans.hashCode());
		result = prime * result + ((security_que == null) ? 0 : security_que.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
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
		User other = (User) obj;
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
		if (roleList == null) {
			if (other.roleList != null)
				return false;
		} else if (!roleList.equals(other.roleList))
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
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", password=" + password + ", security_que="
				+ security_que + ", security_ans=" + security_ans + ", age=" + age + ", contact=" + contact
				+ ", alt_contact=" + alt_contact + ", roleList=" + roleList + "]";
	}

	
}
