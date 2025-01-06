package com.jpacourse.persistence.dao.impl;

import com.jpacourse.persistence.dao.VisitDao;
import com.jpacourse.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class VisitDaoImpl extends AbstractDao<VisitEntity, Long> implements VisitDao
{
    @Override
    public Collection<VisitEntity> findByPatient(Long patientId) {

        return this.entityManager.createQuery(
                "select visitEntity from VisitEntity where visitEntity.patient.id = :patientId", VisitEntity.class)
                .setParameter("patientId", patientId)
                .getResultList();
    }
}