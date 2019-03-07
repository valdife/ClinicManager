package com.webndb.wb;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PatientRepository extends CrudRepository<Patient, Long> {

    Optional<Patient> findById(Long id);
    void deleteById(Long id);
}