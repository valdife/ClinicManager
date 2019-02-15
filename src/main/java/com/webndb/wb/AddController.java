package com.webndb.wb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AddController {

    @Autowired
    CustomerRepository repository;

    @GetMapping("/add-patient-form")
    public String addPatient(Model model) {

        return "add-patient-form";
    }
}
