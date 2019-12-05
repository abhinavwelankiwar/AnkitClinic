package com.cognizant.clinix.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.clinix.model.MedicareService;


@Repository
public interface MedicareServiceRepository extends JpaRepository<MedicareService, Integer> {

	@Query(value = "SELECT medicare_service_id,medicare_service,service_description,amount FROM medicare_services WHERE medicare_service_id=?;", nativeQuery = true)
	Optional<MedicareService> findMedicalService(long id);
	
	
	/*@Transactional
	@Modifying
	@Query(value="INSERT INTO medicare_services(medicare_service_id,medicare_service,service_description,amount) values (?,?,?,?);", nativeQuery=true)
	Integer addMedicareServices(long id, String name, String description, long amount);*/
	
}
