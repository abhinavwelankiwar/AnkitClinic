package com.cognizant.clinix.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doctor_id")
	private long doctorId;

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
	
	@Column(name = "address_line_1")
	private String address1;
	
	@Column(name = "address_line_2")
	private String address2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "degree")
	private String degree;
	
	@Column(name = "speciality")
	private String speciality;
	
	@Column(name = "work_hours")
	private String workHours;
	
	@Column(name = "hospital_name")
	private String hospitalName;
	
	@Column(name = "approve")
	private boolean approve;
	
	@Column(name = "zipcode")
	private long zipcode;
	
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
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "medicare_services",referencedColumnName="medicare_service_id")
	private MedicareService medicareService;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(long doctorId, String firstName, String lastName, String gender, Date dateOfBirth, String email,
			String password, String address1, String address2, String city, String state, String degree,
			String speciality, String workHours, String hospitalName, boolean approve, long zipcode, String securityQue,
			String securityAns, long age, long contactNumber, long altContactNumber, MedicareService medicareService) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.degree = degree;
		this.speciality = speciality;
		this.workHours = workHours;
		this.hospitalName = hospitalName;
		this.approve = approve;
		this.zipcode = zipcode;
		this.securityQue = securityQue;
		this.securityAns = securityAns;
		this.age = age;
		this.contactNumber = contactNumber;
		this.altContactNumber = altContactNumber;
		this.medicareService = medicareService;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getWorkHours() {
		return workHours;
	}

	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public boolean isApprove() {
		return approve;
	}

	public void setApprove(boolean approve) {
		this.approve = approve;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
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

	public MedicareService getMedicareService() {
		return medicareService;
	}

	public void setMedicareService(MedicareService medicareService) {
		this.medicareService = medicareService;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
		result = prime * result + (int) (age ^ (age >>> 32));
		result = prime * result + (int) (altContactNumber ^ (altContactNumber >>> 32));
		result = prime * result + (approve ? 1231 : 1237);
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + (int) (contactNumber ^ (contactNumber >>> 32));
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((degree == null) ? 0 : degree.hashCode());
		result = prime * result + (int) (doctorId ^ (doctorId >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((hospitalName == null) ? 0 : hospitalName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((medicareService == null) ? 0 : medicareService.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((securityAns == null) ? 0 : securityAns.hashCode());
		result = prime * result + ((securityQue == null) ? 0 : securityQue.hashCode());
		result = prime * result + ((speciality == null) ? 0 : speciality.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((workHours == null) ? 0 : workHours.hashCode());
		result = prime * result + (int) (zipcode ^ (zipcode >>> 32));
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
		Doctor other = (Doctor) obj;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (age != other.age)
			return false;
		if (altContactNumber != other.altContactNumber)
			return false;
		if (approve != other.approve)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (contactNumber != other.contactNumber)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (degree == null) {
			if (other.degree != null)
				return false;
		} else if (!degree.equals(other.degree))
			return false;
		if (doctorId != other.doctorId)
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
		if (hospitalName == null) {
			if (other.hospitalName != null)
				return false;
		} else if (!hospitalName.equals(other.hospitalName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (medicareService == null) {
			if (other.medicareService != null)
				return false;
		} else if (!medicareService.equals(other.medicareService))
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
		if (speciality == null) {
			if (other.speciality != null)
				return false;
		} else if (!speciality.equals(other.speciality))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (workHours == null) {
			if (other.workHours != null)
				return false;
		} else if (!workHours.equals(other.workHours))
			return false;
		if (zipcode != other.zipcode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", password=" + password
				+ ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ ", degree=" + degree + ", speciality=" + speciality + ", workHours=" + workHours + ", hospitalName="
				+ hospitalName + ", approve=" + approve + ", zipcode=" + zipcode + ", securityQue=" + securityQue
				+ ", securityAns=" + securityAns + ", age=" + age + ", contactNumber=" + contactNumber
				+ ", altContactNumber=" + altContactNumber + ", medicareService=" + medicareService + "]";
	}
	

}
