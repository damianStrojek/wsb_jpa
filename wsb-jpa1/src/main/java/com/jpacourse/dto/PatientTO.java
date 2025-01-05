package com.jpacourse.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

public class PatientTO implements Serializable
{
    private Long id;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private String patientNumber;
    private LocalDate dateOfBirth;
    private AddressTO address;
    private Boolean isIll;
    private Collection<VisitTO> visits;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatientNumber() {
        return this.patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Collection<VisitTO> getVisits() {
        return this.visits;
    }

    public void setVisits(Collection<VisitTO> visits) {
        this.visits = visits;
    }

    public Boolean getIll() {
        return this.isIll;
    }

    public void setIll(Boolean isIll) {
        this.isIll = isIll;
    }

    public AddressTO getAddress() {
        return this.address;
    }

    public void setAddress(AddressTO address) {
        this.address = address;
    }
}