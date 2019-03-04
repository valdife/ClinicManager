package com.webndb.wb;

import com.webndb.RepositoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AddController {

    @Autowired
    RepositoriesService repositoriesService;;

    @GetMapping("/patient")
    public String patientAdd(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient";
    }

    @PostMapping("/patient")
    public String patientAddSubmit(@ModelAttribute Patient patient) {
        repositoriesService.patientRepository.save(patient);
        return "more";
    }
}