package com.webndb.address;

import org.springframework.data.repository.CrudRepository;

<<<<<<< HEAD
=======
import java.util.Set;

>>>>>>> develop/address_service
public interface AddressRepository extends CrudRepository<Address, Long> {

    Iterable<Address> findAllByResort (String resort);
//    Set<Address> findAllById (Long id);
}