package com.jpacourse.service;

import com.jpacourse.dto.DoctorTO;
import com.jpacourse.dto.PatientTO;
import com.jpacourse.dto.VisitTO;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class VisitServiceTest {
    @Autowired
    private VisitService visitService;

    @Test
    public void shouldFindAllVisitsByPatientId() {
        Long patientId = 5L;

        Collection<VisitTO> visits = visitService.findAllByPatientId(patientId);
        List<VisitTO> listOfVisits = new ArrayList<>(visits);

        assertNotNull(listOfVisits);
        assertThat(listOfVisits).hasSize(2);

        VisitTO secondVisit = listOfVisits.get(1);
        assertThat(secondVisit).isNotNull();
        assertThat(secondVisit.getId()).isEqualTo(10L);
        assertThat(secondVisit.getDescription()).isEqualTo("Consultation about sore throat after karaoke night");
        assertThat(secondVisit.getTime()).isEqualTo(LocalDateTime.parse("2024-12-30T16:40"));

        PatientTO patient = secondVisit.getPatientEntity();
        assertThat(patient).isNotNull();
        assertThat(patient.getId()).isEqualTo(patientId);
        assertThat(patient.getFirstName()).isEqualTo("Charlotte");
        assertThat(patient.getLastName()).isEqualTo("Evans");
        assertThat(patient.getTelephoneNumber()).isEqualTo("+61 3 9876 5432");

        DoctorTO doctor = secondVisit.getDoctor();
        assertThat(doctor).isNotNull();
        assertThat(doctor.getFirstName()).isEqualTo("Claire");
        assertThat(doctor.getLastName()).isEqualTo("Dupont");
        assertThat(doctor.getTelephoneNumber()).isEqualTo("+33 1 42 68 11 88");
    }
}
