package com.webndb.address;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

    Iterable<Address> findAllByResort (String resort);
}