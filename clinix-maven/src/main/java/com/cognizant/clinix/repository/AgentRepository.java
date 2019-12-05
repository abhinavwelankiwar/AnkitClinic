package com.cognizant.clinix.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.clinix.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {

	@Query(value = "select agent_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,address_line_1,address_line_2,city,state,"
			+ "zipcode,commission from agent;", nativeQuery = true)
	List<Agent> getAllAgents();
	
	@Query(value = "select agent_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,address_line_1,address_line_2,city,state,"
			+ "zipcode,commission from agent where agent_id=?;", nativeQuery = true)
	Agent getAgent(long id);
	
	/*@Modifying
	@Transactional
	@Query(value = "Insert into agent(agent_id,first_name,last_name,age,gender,date_of_birth,contact_number,alt_contact_number,email_id,password,address_line_1,address_line_2,city,state,zipcode,commission) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	Integer addAgent(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String address1, String address2, String city, String state, long zipcode, long commission);

   */
}
