package com.webndb.wb;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PatientRepository extends CrudRepository<Patient, Long> {

    Iterable<Patient> findAll();
    Optional<Patient> findById(Long id);
    Optional<Patient> findByPesel(Integer pesel);
    void deleteById(Long id);
}