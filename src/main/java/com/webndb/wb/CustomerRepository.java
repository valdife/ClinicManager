package com.webndb.wb;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Patient, Long> {

    Iterable<Patient> findAll();
    //List<Patient> findById();
    //List<Patient> listAll();


}