package com.webndb.address;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AddressRepository extends CrudRepository<Address, Long> {

    Iterable<Address> findAllByResort (String resort);
//    Set<Address> findAllById (Long id);
}