package com.cognizant.clinix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicare_services")
public class MedicareService {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicare_service_id")
	private long medicareServiceId;
	
	@Column(name="medicare_service")
	private String medicareService;
	
	@Column(name="service_description")
	private String serviceDescription;
	
	@Column(name="amount")
	private long amount;
	
	

	public MedicareService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicareService(long medicareServiceId, String medicareService, String serviceDescription, long amount) {
		super();
		this.medicareServiceId = medicareServiceId;
		this.medicareService = medicareService;
		this.serviceDescription = serviceDescription;
		this.amount = amount;
	}

	public long getMedicareServiceId() {
		return medicareServiceId;
	}

	public void setMedicareServiceId(long medicareServiceId) {
		this.medicareServiceId = medicareServiceId;
	}

	public String getMedicareService() {
		return medicareService;
	}

	public void setMedicareService(String medicareService) {
		this.medicareService = medicareService;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (amount ^ (amount >>> 32));
		result = prime * result + ((medicareService == null) ? 0 : medicareService.hashCode());
		result = prime * result + (int) (medicareServiceId ^ (medicareServiceId >>> 32));
		result = prime * result + ((serviceDescription == null) ? 0 : serviceDescription.hashCode());
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
		MedicareService other = (MedicareService) obj;
		if (amount != other.amount)
			return false;
		if (medicareService == null) {
			if (other.medicareService != null)
				return false;
		} else if (!medicareService.equals(other.medicareService))
			return false;
		if (medicareServiceId != other.medicareServiceId)
			return false;
		if (serviceDescription == null) {
			if (other.serviceDescription != null)
				return false;
		} else if (!serviceDescription.equals(other.serviceDescription))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MedicareService [medicareServiceId=" + medicareServiceId + ", medicareService=" + medicareService
				+ ", serviceDescription=" + serviceDescription + ", amount=" + amount + "]";
	}
	
	
}
