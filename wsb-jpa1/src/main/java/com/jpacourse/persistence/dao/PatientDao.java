package com.jpacourse.persistence.dao;

import com.jpacourse.persistence.entity.PatientEntity;
import com.jpacourse.persistence.entity.VisitEntity;

import java.time.LocalDateTime;
import java.util.Collection;

public interface PatientDao extends Dao<PatientEntity, Long> {
    PatientEntity findPatientById(Long patientId);

    Collection<PatientEntity> findPatientsByLastName(String lastName);
    Collection<PatientEntity> findPatientsWithVisitsCountGreaterThan(int visitsCount);
    Collection<PatientEntity> findPatientsByIllnessStatus(Boolean isIll);

    PatientEntity saveOrUpdate(PatientEntity patientEntity);
    void deletePatientById(Long patientId);
    VisitEntity addVisitToPatient(Long patientId, Long doctorId, String description, LocalDateTime time);
}
