package com.webndb;

import com.webndb.address.AddressRepository;
import com.webndb.wb.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReposConnectSvc {

    private final AddressRepository addressRepo;
    private final PatientRepository patientRepo;

    @Autowired
    ReposConnectSvc(AddressRepository addressRepo, PatientRepository patientRepo) {
        this.addressRepo = addressRepo;
        this.patientRepo = patientRepo;
    }

//    @RequestMapping("/foobar/{id}")
//    public String fooBar(@PathVariable("id") Long id) {
//        Foo foo = fooRepo.findById(id);
//        Bar bar = barRepo.findById(id);
//
//        return foo.getFoo() + " " + bar.getBar();
//    }
}