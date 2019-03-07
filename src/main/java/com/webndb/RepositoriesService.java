package com.webndb;

import com.webndb.address.AddressRepository;
import com.webndb.wb.Patient;
import com.webndb.wb.PatientRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

@Service
@Transactional
public class RepositoriesService {

    private final AddressRepository addressRepository;
    private final PatientRepository patientRepository;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Autowired
    RepositoriesService(AddressRepository addressRepository, PatientRepository patientRepository) {
        this.addressRepository = addressRepository;
        this.patientRepository = patientRepository;
    }

    @Bean
    public SessionFactory getSessionFactory() {
        if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        return entityManagerFactory.unwrap(SessionFactory.class);

    }


    public void savePatient(Patient patient) {
        Transaction tx = null;
        try (Session sess = getSessionFactory().openSession()) {
            tx = sess.beginTransaction();
            patientRepository.save(patient);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        }
    }

    public Patient findPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    }

    public Iterable<Patient> findAll() {
        return patientRepository.findAll();
    }
//
//    public Set<Address> findAddressById(Long id) {
//        return addressRepository.findAllById(id);
//    }
}