package com.jpacourse.persistance.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.jpacourse.persistence.dao.AddressDao;
import com.jpacourse.persistence.entity.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressDaoTest
{
    @Autowired
    private AddressDao addressDao;

    @Transactional
    @Test
    public void testShouldFindAddressById() {
        // Given
        // When
        AddressEntity addressEntity = addressDao.findOne(1L);
        // Then
        assertThat(addressEntity).isNotNull();
        assertThat(addressEntity.getPostalCode()).isEqualTo("99-999");
    }

    @Test
    public void testShouldSaveAddress() {
        // Given
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setAddressLine1("What is this?");
        addressEntity.setAddressLine2("Welp, yeah");
        addressEntity.setCity("Masterdam");
        addressEntity.setPostalCode("88-888");
        long entitiesNumBefore = addressDao.count();

        // When
        final AddressEntity saved = addressDao.save(addressEntity);

        // Then
        assertThat(saved).isNotNull();
        assertThat(saved.getId()).isNotNull();
        assertThat(addressDao.count()).isEqualTo(entitiesNumBefore+1);
    }

    @Transactional
    @Test
    public void testShouldSaveAndRemoveAddress() {
        // Given
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setAddressLine1("What is this?");
        addressEntity.setAddressLine2("Welp, yeah");
        addressEntity.setCity("Masterdam");
        addressEntity.setPostalCode("88-888");

        // When
        final AddressEntity saved = addressDao.save(addressEntity);
        assertThat(saved.getId()).isNotNull();
        final AddressEntity newSaved = addressDao.findOne(saved.getId());
        assertThat(newSaved).isNotNull();

        addressDao.delete(saved.getId());

        // Then
        final AddressEntity removed = addressDao.findOne(saved.getId());
        assertThat(removed).isNull();
    }
}
