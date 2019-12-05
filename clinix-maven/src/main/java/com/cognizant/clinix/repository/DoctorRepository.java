package com.cognizant.clinix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.clinix.model.Doctor;
import com.cognizant.clinix.model.MedicareService;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	@Query(value = "select doctor_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,address_line_1,address_line_2,city,state,"
			+ "zipcode,degree,speciality,work_hours,hospital_name,security_question,security_question_answer,medicare_services,approve from doctor where approve=true OR approve=1;", nativeQuery = true)
	List<Doctor> getAllDoctorsForUser();
	
    @Modifying
	@Transactional
	@Query(value="UPDATE doctor SET approve=? where doctor_id=?",nativeQuery=true)
    Integer updateDoctorApproval(boolean approve, long doctor);
    
    @Query(value = "select doctor_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,address_line_1,address_line_2,city,state,"
			+ "zipcode,degree,speciality,work_hours,hospital_name,security_question,security_question_answer,medicare_services,approve from doctor where (approve=true OR approve=1) AND medicare_services=?;", nativeQuery = true)
	List<Doctor> getAllDoctorsForMedicareService(MedicareService ms);
    
    	
}
