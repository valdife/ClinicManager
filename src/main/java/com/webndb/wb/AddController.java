package com.webndb.wb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class AddController {

    @Autowired
    PatientRepository repository;

    @GetMapping("/patient")
    public String patientAdd(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient";
    }

    @PostMapping("/patient")
    public String patientAddSubmit(@ModelAttribute Patient patient) {
        repository.save(patient);
        return "more";
    }
}