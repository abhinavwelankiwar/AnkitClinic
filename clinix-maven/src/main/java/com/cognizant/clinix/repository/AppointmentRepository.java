package com.cognizant.clinix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.clinix.model.Agent;
import com.cognizant.clinix.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
	
	@Query(value="SELECT appointment_id,medicare_service_id,doctor_id,agent_id,time_slot,date_of_appointment  FROM appointment WHERE time_slot=? ORDER BY time_slot;",nativeQuery=true)
	List<Appointment> AppointmentsByTimeSlot();
	
	@Query(value="SELECT appointment_id,medicare_service_id,doctor_id,agent_id,time_slot,date_of_appointment  FROM appointment WHERE time_slot=? ORDER BY agent_id DESC;",nativeQuery=true)
	List<Appointment> appointmentsByPriority();
	
	/*@Modifying
	@Transactional
	@Query(value = "Insert into agent(agent_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,address_line_1,address_line_2,city,state,zipcode,commission) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	Integer addAgent(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String address1, String address2, String city, String state, long zipcode, long commission);

   */
}
