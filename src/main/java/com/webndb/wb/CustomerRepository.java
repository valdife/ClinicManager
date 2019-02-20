package com.webndb.wb;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Patient, Long> {

    Iterable<Patient> findAll();
    Optional<Patient> findById(Long id);
}