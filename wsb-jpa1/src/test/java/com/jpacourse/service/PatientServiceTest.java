package com.jpacourse.service;

import com.jpacourse.dto.PatientTO;
import com.jpacourse.persistence.dao.AddressDao;
import com.jpacourse.persistence.dao.PatientDao;
import com.jpacourse.persistence.dao.DoctorDao;
import com.jpacourse.persistence.dao.VisitDao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class PatientServiceTest {
    @Autowired
    private PatientService patientService;

    @Autowired
    private VisitDao visitDao;

    @Autowired
    private PatientDao patientDao;

    @Autowired
    private DoctorDao doctorDao;

    @Autowired
    private AddressDao addressDao;

    @Test
    public void shouldDeletePatientAndVisits() {
        PatientTO patientStateBefore = patientService.getPatientById(8L);
        assertThat(patientStateBefore).isNotNull();
        assertThat(visitDao.findByPatient(8L)).isNotEmpty();
        int doctorCount = doctorDao.findAll().size();
        int patientCount = patientDao.findAll().size();

        patientService.deletePatient(8L);

        PatientTO patientAfter = patientService.getPatientById(8L);
        assertThat(patientAfter).isNull();
        assertThat(visitDao.findByPatient(8L)).isEmpty();
        assertThat(doctorDao.findAll().size()).isEqualTo(doctorCount);
        assertThat(patientDao.findAll().size()).isEqualTo(patientCount-1);
    }

    @Test
    public void shouldReturnCorrectStructure() {
        PatientTO patient = patientService.getPatientById(8L);

        assertThat(patient).isNotNull();
        assertThat(patient.getFirstName()).isEqualTo("Giulia");
        assertThat(patient.getLastName()).isEqualTo("Bianchi");
        assertThat(patient.getPatientNumber()).isEqualTo("P008");
        assertThat(patient.getEmail()).isEqualTo("giulia.bianchi@romemail.it");
        assertThat(patient.getTelephoneNumber()).isEqualTo("+39 345 678 9012");
        assertThat(patient.getAddress()).isEqualToComparingFieldByField(addressDao.findOne(9L));
        assertThat(patient.getVisits()).size().isEqualTo(1);
    }
}