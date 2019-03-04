package com.webndb.wb;

import com.webndb.RepositoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MoreController {

    @Autowired
    RepositoriesService repositoriesService;

    @GetMapping("/more/{id}")
    public String patientShowMore(@PathVariable("id") Long id, Model model){
        Patient patient = repositoriesService.patientRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("patient", patient);
        return "more";
    }
}

