package com.jpacourse.dto;

import com.jpacourse.persistence.enums.Specialization;

import java.io.Serializable;
import java.util.Collection;

public class DoctorTO implements Serializable
{
    private Long id;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private String doctorNumber;
    private AddressTO address;
    private Collection<VisitTO> visits;
    private Specialization specialization;

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

    public String getDoctorNumber() {
        return this.doctorNumber;
    }

    public void setDoctorNumber(String doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public AddressTO getAddress() {
        return this.address;
    }

    public void setAddress(AddressTO address) {
        this.address = address;
    }

    public Collection<VisitTO> getVisits() {
        return this.visits;
    }

    public void setVisits(Collection<VisitTO> visits) {
        this.visits = visits;
    }

    public Specialization getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

}