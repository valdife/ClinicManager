package com.webndb.wb;

import com.webndb.RepositoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EditController {

    @Autowired
    RepositoriesService repositoriesService;

    @GetMapping("/edit/{id}")
    public String patientShowMore(@PathVariable("id") Long id, Model model) {
        Patient patient = repositoriesService.patientRepository.findById(id).get();
        model.addAttribute("patient", patient);
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateUser(@PathVariable("id") Long id, Patient patient, Model model) {
        repositoriesService.patientRepository.save(patient);
        return "more";
    }
}