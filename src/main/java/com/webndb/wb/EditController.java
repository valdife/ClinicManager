package com.webndb.wb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class EditController {

    @Autowired
    CustomerRepository repository;

    @GetMapping("/edit/{id}")
    public String patientShowMore(@PathVariable("id") Long id, Model model){
        Patient patient = repository.findById(id).get();
        model.addAttribute("patient", patient);
        return "edit";
    }
//    @PostMapping("/edit/{id}")
//    public String updateUser(@PathVariable("id") long id, @Valid Patient patient,
//                             BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            patient.setId(id);
//            return "more";
//        }
//
//        repository.save(patient);
//        model.addAttribute("users", repository.findAll());
//        return "more";
//    }

//    @GetMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") long id, Model model) {
//        Patient patient = repository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        repository.delete(patient);
//        model.addAttribute("users", repository.findAll());
//        return "more";
//    }
}

