package com.jpacourse.persistance.dao;

import com.jpacourse.persistence.dao.DoctorDao;
import com.jpacourse.persistence.dao.PatientDao;
import com.jpacourse.persistence.entity.DoctorEntity;
import com.jpacourse.persistence.entity.PatientEntity;
import com.jpacourse.persistence.entity.VisitEntity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PatientDaoTest {
    @Autowired
    private PatientDao patientDao;

    @Autowired
    private DoctorDao doctorDao;

    @Test
    public void createVisit()
    {
        LocalDateTime visitDate = LocalDateTime.now();
        DoctorEntity doctor = doctorDao.findOne(10L);
        PatientEntity patient = patientDao.findOne(10L);

        assertThat(patient).isNotNull();
        assertThat(doctor).isNotNull();

        int patientVisitsCount = patient.getVisits().size();

        VisitEntity result = patientDao.addVisitToPatient(10L, 10L, "A woman comes to the doctor...", visitDate);

        assertThat(result).isNotNull();

        assertThat(patient.getVisits().size()).isEqualTo(patientVisitsCount + 1);
        assertThat(result.getPatient().getId()).isEqualTo(patient.getId());
        assertThat(result.getDoctor().getId()).isEqualTo(doctor.getId());
        assertThat(result.getDescription()).isEqualTo("A woman comes to the doctor...");
        assertThat(result.getTime()).isEqualTo(visitDate);
    }

    @Test
    public void testFindPatientsByLastName()
    {
        String lastName = "Strojek";

        Collection<PatientEntity> result = patientDao.findPatientsByLastName(lastName);
        List<PatientEntity> listOfResults = new ArrayList<>(result);

        assertNotNull(listOfResults);
        assertFalse(listOfResults.isEmpty());
        assertEquals(listOfResults.size(), 2);
        assertEquals(listOfResults.get(0).getLastName(), lastName);
        assertEquals(listOfResults.get(1).getLastName(), lastName);
        assertEquals(listOfResults.get(1).getFirstName(), "Ji-Hye");
    }

    @Test
    public void testFindPatientsWithVisitsCountGreaterThanOne()
    {
        int visitsCount = 1;

        Collection<PatientEntity> result = patientDao.findPatientsWithVisitsCountGreaterThan(visitsCount);
        List<PatientEntity> listOfResults = new ArrayList<>(result);

        assertNotNull(listOfResults);
        assertFalse(listOfResults.isEmpty());
        assertEquals(5, listOfResults.size());

        PatientEntity patient = listOfResults.get(0);
        assertThat(patient).isNotNull();
        assertEquals("taro.sato@japanmail.co.jp", patient.getEmail());
    }

    @Test
    public void testFindPatientsWithIllness() {
        Boolean isIll = true;

        Collection<PatientEntity> result = patientDao.findPatientsByIllnessStatus(isIll);
        List<PatientEntity> listOfResults = new ArrayList<>(result);

        assertNotNull(listOfResults);
        assertFalse(listOfResults.isEmpty());
        assertEquals(2, listOfResults.size());

        PatientEntity patient = listOfResults.get(0);
        assertNotNull(patient);

        assertEquals("Ivan", patient.getFirstName());
        assertEquals("Popov", patient.getLastName());
        assertEquals("P004", patient.getPatientNumber());
        assertThat(patient.getIsIll()).isEqualTo(isIll);

        PatientEntity patient2 = listOfResults.get(1);
        assertNotNull(patient2);

        assertEquals("Carlos", patient2.getFirstName());
        assertEquals("Martinez", patient2.getLastName());
        assertEquals("P007", patient2.getPatientNumber());
        assertThat(patient2.getIsIll()).isEqualTo(isIll);
    }

    @Test
    public void testConcurrentModification() throws InterruptedException {
        Long patientId = 10L;

        Thread thread1 = new Thread(() -> {
            PatientEntity patientDebug = patientDao.findOne(patientId);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            patientDebug.setTelephoneNumber("+54 9 11 5555-4444");
            assertThrows(ObjectOptimisticLockingFailureException.class, () -> {
                patientDao.update(patientDebug);
            });
        });

        Thread thread2 = new Thread(() -> {
            PatientEntity patientDebug2 = patientDao.findOne(patientId);
            patientDebug2.setTelephoneNumber("+48 987 654 321");
            patientDao.update(patientDebug2);
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}