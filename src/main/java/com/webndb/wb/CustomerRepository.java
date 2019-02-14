package com.webndb.wb;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Patient, Long> {

    Iterable<Patient> findAll();

}