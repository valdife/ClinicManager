package com.webndb.wb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowController {

    @Autowired
    CustomerRepository repository;

    @GetMapping("/patient-list")
    public String patientList(Model model) {
        //Patient list
        List<Patient> list = new ArrayList<>();
        repository.findAll().forEach(list::add);

        model.addAttribute("list", list);
        return "patient-list";
    }

//    @GetMapping("/add-patient")
//    public String addPatient(Model model) {
//
//        return "add-patient";
//    }
}
