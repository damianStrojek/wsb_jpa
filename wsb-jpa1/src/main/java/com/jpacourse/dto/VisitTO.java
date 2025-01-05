package com.jpacourse.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;

public class VisitTO implements Serializable
{
    private Long id;
    private String description;
    private LocalDateTime time;

    @JsonIgnoreProperties({"doctor"})
    private DoctorTO doctor;

    @JsonIgnoreProperties({"patientEntity"})
    private PatientTO patientEntity;
    private Collection<MedicalTreatmentTO> treatments;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return this.time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @JsonIgnore
    public DoctorTO getDoctor() {
        return this.doctor;
    }

    public void setDoctor(DoctorTO doctor) {
        this.doctor = doctor;
    }

    @JsonIgnore
    public PatientTO getPatientEntity() {
        return this.patientEntity;
    }

    public void setPatientEntity(PatientTO patientEntity) {
        this.patientEntity = patientEntity;
    }

    public Collection<MedicalTreatmentTO> getTreatments() {
        return this.treatments;
    }

    public void setTreatments(Collection<MedicalTreatmentTO> treatments) {
        this.treatments = treatments;
    }

}
