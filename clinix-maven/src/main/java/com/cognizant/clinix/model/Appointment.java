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
@Table(name = "appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appointment_id")
	private long appointmentId;

	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "doctor_id",referencedColumnName="doctor_id")
	private Doctor doctor;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "agent_id",referencedColumnName="agent_id")
	private Agent agent;

	@Column(name = "time_slot")
	private int timeSlot;

	@Column(name = "date_of_appointment")
	private Date dateOfAppointment;
	
	@Column(name = "status")
	private Boolean status;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(long appointmentId, Doctor doctor, Agent agent, int timeSlot, Date dateOfAppointment,
			Boolean status) {
		super();
		this.appointmentId = appointmentId;
		this.doctor = doctor;
		this.agent = agent;
		this.timeSlot = timeSlot;
		this.dateOfAppointment = dateOfAppointment;
		this.status = status;
	}

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public int getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(int timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Date getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agent == null) ? 0 : agent.hashCode());
		result = prime * result + (int) (appointmentId ^ (appointmentId >>> 32));
		result = prime * result + ((dateOfAppointment == null) ? 0 : dateOfAppointment.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + timeSlot;
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
		Appointment other = (Appointment) obj;
		if (agent == null) {
			if (other.agent != null)
				return false;
		} else if (!agent.equals(other.agent))
			return false;
		if (appointmentId != other.appointmentId)
			return false;
		if (dateOfAppointment == null) {
			if (other.dateOfAppointment != null)
				return false;
		} else if (!dateOfAppointment.equals(other.dateOfAppointment))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (timeSlot != other.timeSlot)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", doctor=" + doctor + ", agent=" + agent + ", timeSlot="
				+ timeSlot + ", dateOfAppointment=" + dateOfAppointment + ", status=" + status + "]";
	}


	
}
