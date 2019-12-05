package com.cognizant.clinix.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.clinix.model.MedicareService;
import com.cognizant.clinix.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "SELECT id,first_name,last_name,age,gender,date_of_birth,contact,alt_contact,email,password,security_que,security_ans FROM user WHERE email=?;", nativeQuery = true)
	Optional<User> findUserByUsername(String username);

	/*
	 * @Query(value =
	 * "SELECT us_name,first_name,last_name,password FROM user WHERE us_id=?;",
	 * nativeQuery = true) Optional<User> findUserByUserId(long userId);
	 */
	@Modifying
	@Transactional
	@Query(value = "Insert into user(id,first_name,last_name,age,gender,date_of_birth,contact,alt_contact,email,password,security_que,security_ans) values (?,?,?,?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	Integer addUser(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String sq, String sa);

	@Modifying
	@Transactional
	@Query(value = "Insert into admin(admin_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,security_question,security_question_answer) values (?,?,?,?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	Integer addAdmin(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String sq, String sa);

	@Modifying
	@Transactional
	@Query(value = "Insert into doctor(doctor_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,address_line_1,address_line_2,city,state,zipcode,degree,speciality,work_hours,hospital_name,security_question,security_question_answer,medicare_services,approve) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	Integer addDoctor(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String ad1, String ad2, String city, String state,
			long zip, String degree, String spe, String work, String hn, String sq, String sa, MedicareService ms,
			boolean approve);

	@Modifying
	@Transactional
	@Query(value = "Insert into patient(patient_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,address_line_1,address_line_2,city,state,zipcode,security_question,security_question_answer,approve) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	Integer addPatient(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String ad1, String ad2, String city, String state,
			long zip, String sq, String sa, boolean approve);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO user_role (ur_us_id, ur_ro_id) values (?,?)", nativeQuery = true)
	Integer addUserRole(long userId, long rollId);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO agent (agent_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,address_line_1,address_line_2,city,state,zipcode,commission) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);", nativeQuery = true)
	Integer addAgent(long id, String fn, String ln, long age, String gender, Date dob, long cn, long acn,
			String emailid, String password, String ad1, String ad2, String city, String state, long zipcode, long c);

}
