package com.webndb.wb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SearchController {

    @Autowired
    PatientRepository repository;

    @GetMapping("/patient-search")
    public String patientAdd(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient";
    }

    @PostMapping("/patient-search")
    public String patientFind(@ModelAttribute Patient patient) {
        repository.findByPesel(patient.getPesel());
        return "searchres";
    }
}