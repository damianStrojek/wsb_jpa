package com.jpacourse.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	/*
		Many-To-One relation - there can be many Visits for the same Patient
	 */
	@ManyToOne
	@JoinColumn(name="patient_id")
	private PatientEntity patient;

	/*
		Many-To-One relation - there can be many Visits with the same Doctor
	 */
	@ManyToOne
	@JoinColumn(name="doctor_id")
	private DoctorEntity doctor;

	/*
	 	One-To-Many relation - there can be one Visit with many MedicalTreatments
	 */
	@OneToMany(mappedBy="visit", cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=true)
	private Collection<MedicalTreatmentEntity> medicalTreatments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public Collection<MedicalTreatmentEntity> getMedicalTreatments() {
		return medicalTreatments;
	}

	public void setMedicalTreatments(Collection<MedicalTreatmentEntity> medicalTreatments) {
		this.medicalTreatments = medicalTreatments;
	}

	public void addMedicalTreatment(MedicalTreatmentEntity medicalTreatment) {
		medicalTreatments.add(medicalTreatment);
		medicalTreatment.setVisit(this);
	}

	public void removeMedicalTreatment(MedicalTreatmentEntity medicalTreatment) {
		medicalTreatments.remove(medicalTreatment);
		medicalTreatment.setVisit(null);
	}

}
