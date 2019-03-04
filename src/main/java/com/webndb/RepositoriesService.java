package com.webndb;

import com.webndb.address.AddressRepository;
import com.webndb.wb.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepositoriesService {

    public final AddressRepository addressRepository;
    public final PatientRepository patientRepository;

    @Autowired
    RepositoriesService(AddressRepository addressRepository, PatientRepository patientRepository) {
        this.addressRepository = addressRepository;
        this.patientRepository = patientRepository;
    }

//    @RequestMapping("/foobar/{id}")
//    public String fooBar(@PathVariable("id") Long id) {
//        Foo foo = fooRepo.findById(id);
//        Bar bar = barRepo.findById(id);
//
//        return foo.getFoo() + " " + bar.getBar();
//    }
}