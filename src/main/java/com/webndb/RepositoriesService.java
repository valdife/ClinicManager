package com.webndb;

import com.webndb.address.Address;
import com.webndb.address.AddressRepository;
import com.webndb.wb.Patient;
import com.webndb.wb.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class RepositoriesService {

    private final AddressRepository addressRepository;
    private final PatientRepository patientRepository;

    @Autowired
    RepositoriesService(AddressRepository addressRepository, PatientRepository patientRepository) {
        this.addressRepository = addressRepository;
        this.patientRepository = patientRepository;
    }

    public void savePatient(Patient patient) {
        patientRepository.save(patient);
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