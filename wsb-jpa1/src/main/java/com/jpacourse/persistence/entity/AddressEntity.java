package com.jpacourse.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String city;

	@Column(nullable = false)
	private String addressLine1;

	@Column(nullable = false)
	private String addressLine2;

	@Column(nullable = false)
	private String postalCode;

	/*
		One-To-One relation - one Address can be assigned to one Patient
		# I would argue with this one because there can be many Patients under the same roof
		# but it might be my mistake when reading the graph
	 */
	@OneToOne
	private PatientEntity patientEntity;

	/*
		One-To-One relation - one Address can be assigned to one Patient
		# Same situation as with patientEntity
	 */
	@OneToOne
	private DoctorEntity doctorEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public PatientEntity getPatient() {
		return patientEntity;
	}

	public void setPatient(PatientEntity patient) {
		this.patientEntity = patient;
	}

	public DoctorEntity getDoctor() {
		return doctorEntity;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctorEntity = doctor;
	}

}
